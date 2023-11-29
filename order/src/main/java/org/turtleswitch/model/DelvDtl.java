package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DELV_DTL")
@Getter
@Setter
@NoArgsConstructor
public class DelvDtl {

    @Id
    @Column(name = "DELV_POS_SEQ")
    private int delvPosSeq;

    @Id
    @Column(name = "DELV_SEQ")
    private String delvSeq;

    @Id
    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;

    @Column(name = "POS")
    private String pos;

    @Column(name = "ARRIVAL_DT")
    private String arrivalDt;
}
