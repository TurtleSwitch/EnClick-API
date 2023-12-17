package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;


@Entity
@Table(name = "DELV_MST")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(DelvMstPK.class)
public class DelvMst {

    @Id
    @Column(name = "DELV_SEQ")
    private int delvSeq;

    @Id
    @Column(name = "ORDER_MST_UUID")
    private String orderMstUuid;

    @Column(name = "ADDRESS_UUID")
    private String addressUuid;

    @Column(name = "TRACKING_ID")
    private String trackingId;

    @Column(name = "DELV_COMP_CD")
    private String delvCompCd;

    @Column(name = "USED_YN")
    private String usedYn;

    @Column(name = "DELV_STAT_CD")
    private DelvStatCd delvStatCd;

    @Column(name = "REGI_DT")
    @CreationTimestamp
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @UpdateTimestamp
    private Timestamp updaDt;
}
