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

import java.time.LocalDateTime;

@Entity
@Table(name = "PAY_CALC_ACCOUNT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayCalcAccount {
    @Id
    @Column(name="ACCOUNT_NO")
    String accountNo;

    @Column(name="COMP_CD")
    String compCd;

    @Column(name="USER")
    String sellerId;

    @CreationTimestamp
    @Column(name="REGI_DT")
    LocalDateTime regiDt;

    @Column(name="UPDA_DT")
    LocalDateTime updaDt;
}
