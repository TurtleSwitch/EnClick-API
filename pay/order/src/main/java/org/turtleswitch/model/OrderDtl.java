package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

@Entity
@Table(name = "ORDER_DTL")
@Getter
@Setter
@NoArgsConstructor
@IdClass(OrderDtlPK.class)
public class OrderDtl {

    @Id
    @Column(name = "OPTION_ID")
    private String optionId;

    @Id
    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;
}
