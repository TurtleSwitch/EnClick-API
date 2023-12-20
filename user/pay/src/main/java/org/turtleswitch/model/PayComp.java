package org.turtleswitch.model;

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
@Table(name = "PAY_COMP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayComp {

    @Id
    @Column(name="COMP_CD")
    String compCd;

    @Column(name="COMP_DVCD")
    String compDvcd;

    @Column(name="COMP_NM")
    String compNm;

    @Column(name="REGI_DT")
    LocalDateTime regiDt;

    @Column(name="UPDA_DT")
    LocalDateTime updaDt;
}
