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
@Table(name="FAVOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Favor {

    @Id
    @Column(name="FAVOR_UUID")
    private String favorUUID;
    @Column(name="USER_ID")
    private String userId;
    @Column(name="PROD_CD")
    private String prodCd;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimeStamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
