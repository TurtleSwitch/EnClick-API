package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    @Column(name = "PROD_ID")
    String prodCd;

    @Column(name = "CATEGORY_ID")
    String categoryCd;

    @Column(name = "PROD_NM")
    String prodNm;

    @Column(name = "SELLER_ID")
    String sellerId;

    @Column(name = "PRICE")
    Integer price;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;

}
