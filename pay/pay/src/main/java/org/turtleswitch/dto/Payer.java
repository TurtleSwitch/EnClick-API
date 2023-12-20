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
public class Payer {
    String payerId;
    String payerNm;

    public JPAQuery<Payer> getQuery(JPAQueryFactory jq, BooleanBuilder builder){
        QPayInfo payInfo = new QPayInfo("payInfo");
        QUser payer = new QUser("payer");

        return jq.select(
                        Projections.constructor(
                                Payer.class,
                                payer.userId,
                                payer.nm
                        )
                )
                .from(payInfo)
                .innerJoin(payer).on(payer.userId.eq(payInfo.payerId))
                .where(builder);

    }
}
