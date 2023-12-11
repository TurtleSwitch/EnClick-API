package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="CART_MST")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartMst {

    @Id
    @Column(name="ITEM_UUID")
    private String itemUUID;
    @Column(name="USER_ID")
    private String userId;
    @Column(name="PROD_CD")
    private String prodCd;
    @Column(name="DELV_FEE")
    private int delvFee;
    @Column(name="REGI_DT", updatable=false)
    @CreationTimestamp
    private LocalDateTime regiDt;
    @Column(name="UPDA_DT", insertable=false)
    @UpdateTimestamp
    private LocalDateTime updaDt;
}
