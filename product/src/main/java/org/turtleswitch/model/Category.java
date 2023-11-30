package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "CATEGORY")
@Getter
@Setter
public class Category {

    @Id
    @Column(name = "CATEGORY_CD")
    String categoryCd;

    @Column(name = "PARE_CATEGORY_CD")
    String pareCategoryCd;

    @Column(name = "CATEGORY_NM")
    String categoryNm;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;
    
}
