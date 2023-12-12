package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "OPTION_DETA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OptionDeta {

    @Id
    @Column(name = "OPTION_DETA_CD")
    private String optionDetaCd;

    @Column(name = "GROUP_CD")
    private String groupCd;

    @Column(name = "DETA_NM")
    private String detaNm;

    @Column(name = "SORT")
    private Integer sort;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "USED_YN")
    private String usedYn;

    @Column(name = "REGI_DT")
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    private Timestamp updaDt;

}
