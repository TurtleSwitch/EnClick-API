package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "PRODUCT_DETAIL")
@Getter
@Setter
public class ProductDetail {

    @Id
    @Column(name = "PROD_CD")
    String prodCd;

    @Column(name = "INTR")
    String intr;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;

}
