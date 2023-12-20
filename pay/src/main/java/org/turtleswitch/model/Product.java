package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "PROD_CD")
    String prodCd;

    @Column(name = "CATEGORY_CD")
    String categoryCd;

    @Column(name = "PROD_NM")
    String prodNm;

    @Column(name = "SELLER_UUID")
    String sellerUuid;

    @Column(name = "PRICE")
    Integer price;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;

}
