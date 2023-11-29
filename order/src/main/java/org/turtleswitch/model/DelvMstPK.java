package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Embeddable
public class DelvMstPK {

    @Column(name = "DELV_SEQ")
    private int delvSeq;

    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;
}
