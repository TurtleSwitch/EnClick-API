package com.turtleswitch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="CART_DTL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CartDtlPK.class)
public class CartDtl {

    @Id
    @Column(name="ITEM_UUID")
    private String itemUUID;
    @Id
    @Column(name="OPTION_ID")
    private String optionId;
    @Column(name="QNTY")
    private int qnty;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimeStamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
