package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "DELV_DTL")
@Getter
@Setter
@NoArgsConstructor
@IdClass(DelvDtlPK.class)
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
    @CreatedDate
    private String arrivalDt;
}
