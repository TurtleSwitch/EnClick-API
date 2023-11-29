package org.turtleswitch.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Entity
@Table(name = "ORDER_GROUP")
@Getter
@Setter
@NoArgsConstructor
public class OrderGroup {

    @Id
    @Column(name = "ORDER_UUID")
    private String orderUuid;

    @Column(name = "ORDER_STAT_CD")
    private String orderStatCd;

    @Column(name = "ORDER_DT")
    @CreatedDate
    private Timestamp orderDt;

    @Column(name = "DELV_COST")
    private int delvCost;

}
