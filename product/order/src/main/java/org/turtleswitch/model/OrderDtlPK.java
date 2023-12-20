package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class OrderDtlPK implements Serializable {

    @Column(name = "OPTION_ID")
    private String optionId;

    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;
}
