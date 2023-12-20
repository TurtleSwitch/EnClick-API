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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller{
    String sellerId;
    String sellerNm;
    String compId;
    String accountNo;

    public JPAQuery<Seller> getQuery(JPAQueryFactory jq, BooleanBuilder builder){
        QPayInfo payInfo = new QPayInfo("payInfo");
        QOrderMst orderMst = new QOrderMst("orderMst");
        QProduct product = new QProduct("product");
        QUser seller = new QUser("seller");
        QPayComp payComp = new QPayComp("payComp");

        return jq.select(
                    Projections.constructor(
                        Seller.class,
                        seller.userId,
                        seller.nm,
                        payComp.compCd,
                        payInfo.calcAccountNo
                    )
                )
                .from(payInfo)
                    .innerJoin(orderMst).on(orderMst.orderMstUuid.eq(payInfo.orderMstUuid))
                    .innerJoin(product).on(product.prodCd.eq(orderMst.prodCd))
                        .innerJoin(seller).on(seller.userId.eq(product.sellerUuid))
                            .innerJoin(payComp).on(seller.userId.eq(product.sellerUuid))
                    .innerJoin(payComp).on(payComp.compCd.eq(payInfo.compCd))
                .where(builder);

    }

}
