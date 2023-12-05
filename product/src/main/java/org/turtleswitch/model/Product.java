package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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
    private String prodCd;

    @Column(name = "CATEGORY_ID")
    private String categoryCd;

    @Column(name = "PROD_NM")
    private String prodNm;

    @Column(name = "SELLER_ID")
    private String sellerId;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;

}
