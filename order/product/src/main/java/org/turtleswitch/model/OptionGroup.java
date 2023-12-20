package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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
    private String groupCd;

    @Column(name = "PROD_CD")
    private String prodCd;

    @Column(name = "GROUP_NM")
    private String groupNm;

    @Column(name = "SORT")
    private Integer sort;

    @Column(name = "ESSENTIAL_YN")
    private String essentialYn;

    @Column(name = "USED_YN")
    private String usedYn;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;

}
