package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "OPTION_GROUP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OptionGroup {

    @Id
    @Column(name = "GROUP_CD")
    String groupCd;

    @Column(name = "PROD_CD")
    String prodCd;

    @Column(name = "GROUP_NM")
    String groupNm;

    @Column(name = "SORT")
    Integer sort;

    @Column(name = "ESSENTIAL_YN")
    String essentialYn;

    @Column(name = "USED_YN")
    String usedYn;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;

}
