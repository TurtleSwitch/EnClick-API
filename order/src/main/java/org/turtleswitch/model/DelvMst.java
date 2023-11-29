package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;


@Entity
@Table(name = "DELV_MST")
@Getter
@Setter
@NoArgsConstructor
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

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;
}
