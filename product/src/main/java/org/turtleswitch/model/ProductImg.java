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
@Table(name = "PRODUCT_IMG")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductImg {

    @Id
    @Column(name = "PROD_CD")
    private String prodCd;

    @Column(name = "IMG_URL")
    private String imgUrl;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;

}
