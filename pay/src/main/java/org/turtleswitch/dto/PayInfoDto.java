package org.turtleswitch.dto;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.turtleswitch.model.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayInfoDto {
    Long paySeq;
    String payDvcd;
    String payResuDvcd;
    Long amount;

    // Payer
    String payerId;
    String payerNm;
    //

    // PayMethod
    String payAccountNo;
    String payCompCd;
    String payMethodDvcd;
    //

    //Seller
    String sellerId;
    String sellerNm;
    String calcCompCd;
    String calcAccountNo;
    //

    LocalDateTime payDt;

    public JPAQuery<PayInfoDto> getQuery(JPAQueryFactory jq, BooleanBuilder builder){
        QPayInfo payInfo = new QPayInfo("payInfo");
        QOrderMst orderMst = new QOrderMst("orderMst");
        QProduct product = new QProduct("product");
        QUser seller = new QUser("seller");
        QPayComp payComp = new QPayComp("payComp");
        QUser payer = new QUser("payer");
        QPayMethod payMethod = new QPayMethod("payMethod");

        return jq.select(
                        Projections.constructor(
                                PayInfoDto.class,
                                payInfo.paySeq,
                                payInfo.payDvcd,
                                payInfo.payResuDvcd,
                                payInfo.amount,
                                payer.userId,
                                payer.nm,
                                payInfo.payAccountNo,
                                payMethod.payMethodDvcd,
                                seller.userId,
                                seller.nm,
                                payComp.compCd,
                                payInfo.calcAccountNo,
                                payInfo.payDt
                        )
                )
                .from(payInfo)
                .innerJoin(orderMst).on(orderMst.orderMstUuid.eq(payInfo.orderMstUuid))
                .innerJoin(product).on(product.prodCd.eq(orderMst.prodCd))
                .innerJoin(seller).on(seller.userId.eq(product.sellerId))
                .innerJoin(payComp).on(seller.userId.eq(product.sellerId))
                .innerJoin(payComp).on(payComp.compCd.eq(payInfo.compCd))
                .innerJoin(payer).on(payer.userId.eq(payInfo.payerId))
                .innerJoin(payMethod).on(payMethod.accountNo.eq(payInfo.payAccountNo))
                .where(builder);

    }
}
