package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class DelvMstPK {

    @Column(name = "DELV_SEQ")
    private int delvSeq;

    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;
}
