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
public class DelvDtlPK implements Serializable {

    @Column(name = "DELV_POS_SEQ")
    private int delvPosSeq;

    @Column(name = "DELV_SEQ")
    private String delvSeq;

    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;

}
