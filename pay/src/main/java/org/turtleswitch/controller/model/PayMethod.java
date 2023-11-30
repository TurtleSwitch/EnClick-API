package org.turtleswitch.controller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "PAY_METHOD")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayMethod {
    @Id
    @Column(name="ACCOUNT_NO")
    String accountNo;

    @Column(name="COMP_CD")
    String compCd;

    @Column(name="PAY_METHOD_DVCD")
    String payMethodDvcd;

    @CreationTimestamp
    @Column(name="REGI_DT")
    LocalDateTime regiDt;

    @Column(name="UPDA_DT")
    LocalDateTime updaDt;
}
