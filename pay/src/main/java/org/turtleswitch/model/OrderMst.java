package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

@Entity
@Table(name = "OrderMst")
@Getter
@Setter
@NoArgsConstructor
public class OrderMst {

    @Id
    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;

    @Column(name = "ORDER_UUID")
    private String orderUuid;

    @Column(name = "PROD_CD")
    private String prodCd;

    @Column(name = "STAT_CD")
    private String statCd;

    @Column(name = "PAY_COST")
    private String payCost;

    @Column(name = "NUMBER")
    private int number;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;

}
