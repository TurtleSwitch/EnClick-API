package com.turtleswitch.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="COMM_NM", referencedColumnName="COMM_CD")
    private CommonCode commonCode;

    @Transient
    @Setter(AccessLevel.PROTECTED)
    private String commNm;

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
    @CreationTimestamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;

    public void setCommNm(String commNm) {
        if(commonCode != null && commonCode.getUsedYn()=='Y')
            this.commNm = commonCode.getCommNm();
    }
}
