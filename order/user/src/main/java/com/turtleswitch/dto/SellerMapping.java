package com.turtleswitch.dto;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.turtleswitch.model.Product;
import com.turtleswitch.model.QProduct;
import com.turtleswitch.model.QSeller;
import com.turtleswitch.model.QUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellerMapping {
    //판매자 등록정보
    private String sellerUUID;
    private String sellerNm;
    private String userId;
    private String userNm;

    //판매상품 목록
    private List<Product> productList;

    public JPAQuery<SellerMapping> getQuery(JPAQueryFactory jq, BooleanBuilder builder) {
        QUser user = new QUser("user");
        QSeller seller = new QSeller("seller");

        return jq.select(Projections.constructor(SellerMapping.class,
                    seller.sellerUUID,
                    seller.sellerNm,
                    user.userId,
                    user.nm
                ))
                .from(seller)
                .innerJoin(user).on(user.userId.eq(seller.userId))
                .where(builder) //유저ID 가져와야 함
                ;
    }
}
