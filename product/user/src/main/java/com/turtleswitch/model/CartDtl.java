package com.turtleswitch.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    @Column(name="OPTION_CD")
    private String optionCd;

    @Column(name="QNTY")
    private int qnty;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimestamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
