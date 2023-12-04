package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "PAY_INFO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PayInfoPk.class)
public class PayInfo {

    @Id
    @Column(name="PAY_SEQ")
    int paySeq;

    @Id
    @Column(name="COMP_CD")
    String compCd;

    @Id
    @Column(name="PAYER_ID")
    String payerId;

    @Column(name="PAY_DVCD")
    String payDvcd;

    @Column(name="PAY_RESU_DVCD")
    String payResuDvcd;

    @Column(name="ORDER_MST_UUID")
    String orderMstUuid;

    @Column(name="AMOUNT")
    int amount;

    @Column(name="PAY_DT")
    LocalDateTime payDt;

    @Column(name = "PAY_ACCOUNT_NO")
    String payAccountNo;

    @Column(name = "CALC_ACCOUNT_NO")
    String calcAccountNo;
}
