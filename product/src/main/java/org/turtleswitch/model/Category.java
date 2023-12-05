package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

@Entity
@Table(name = "CATEGORY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {

    @Id
    @Column(name = "CATEGORY_CD")
    private String categoryCd;

    @Column(name = "PARE_CATEGORY_CD")
    private String pareCategoryCd;

    @Column(name = "CATEGORY_NM")
    private String categoryNm;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;
    
}
