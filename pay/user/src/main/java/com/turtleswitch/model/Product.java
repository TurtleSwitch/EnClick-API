package com.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "PROD_ID")
    private String prodCd;

    @Column(name = "CATEGORY_ID")
    private String categoryCd;

    @Column(name = "PROD_NM")
    private String prodNm;

    @Column(name = "SELLER_UUID")
    private String sellerUUID;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "REGI_DT", updatable=false)
    @CreationTimestamp
    private LocalDateTime regiDt;

    @Column(name = "UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;

}
