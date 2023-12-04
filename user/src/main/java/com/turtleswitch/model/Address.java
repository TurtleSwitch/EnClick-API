package com.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="ADDRESS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @Column(name="ADDRESS_UUID")
    private String addressUUID;
    @Column(name="COMM_CD")
    private String commCd;
    @Column(name="USER_ID")
    private String userId;
    @Column(name="ADDRESS_1")
    private String address1;
    @Column(name="ADDRESS_2")
    private String address2;
    @Column(name="ZIP_CODE")
    private int zipCode;
    @Column(name="RECEIVER_NM")
    private String receiverNm;
    @Column(name="RECEIVER_PHONE_NO")
    private String receiverPhoneNo;
    @Column(name="USED_YN")
    private char usedYn;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimeStamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
