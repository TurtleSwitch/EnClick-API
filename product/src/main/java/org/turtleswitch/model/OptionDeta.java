package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "OPTION_DETA")
@Getter
@Setter
public class OptionDeta {

    @Id
    @Column(name = "OPTION_DETA_CD")
    String optionDetaCd;

    @Column(name = "GROUP_CD")
    String groupCd;

    @Column(name = "DETA_NM")
    String detaNm;

    @Column(name = "SORT")
    Integer sort;

    @Column(name = "PRICE")
    Integer price;

    @Column(name = "USED_YN")
    String usedYn;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;

}
