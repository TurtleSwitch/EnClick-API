package com.turtleswitch.dto;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.turtleswitch.model.QFavor;
import com.turtleswitch.model.QProduct;
import com.turtleswitch.model.QSeller;
import com.turtleswitch.model.QUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavorDtl {
    private String FavorUUID;
    private String prodCd;
    private String prodNm;
    private String sellerUUID;
    private String sellerNm;

    public JPAQuery<FavorDtl> getQuery(JPAQueryFactory jq, BooleanBuilder builder) {
        QSeller seller = new QSeller("seller");
        QProduct product = new QProduct("product");
        QFavor favor = new QFavor("favor");

        return jq.select(Projections.constructor(FavorDtl.class,
                        favor.favorUUID,
                        product.prodCd,
                        product.prodNm,
                        seller.sellerUUID,
                        seller.sellerNm
                ))
                .from(favor)
                .innerJoin(product).on(product.prodCd.eq(favor.prodCd))
                .innerJoin(seller).on(seller.sellerUUID.eq(product.sellerUUID))
                .where(builder) //유저ID 가져와야 함
                ;
    }
}
