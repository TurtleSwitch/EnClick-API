package org.turtleswitch.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.turtleswitch.dto.OrderGroupDto.OrderSaveReqDto;

import java.sql.Timestamp;

@Entity
@Table(name = "ORDER_GROUP")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class OrderGroup {

    @Id
    @Column(name = "ORDER_UUID")
    private String orderUuid;

    @Column(name = "ORDER_STAT_CD")
    private String orderStatCd;

    @Column(name = "DELV_COST")
    private int delvCost;

    @Column(name = "ORDER_DT")
    @CreatedDate
    private Timestamp orderDt;

}
