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
@Table(name = "INQUIRY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inquiry {

    @Id
    @Column(name = "INQUIRY_CD")
    private String inquiryCd;

    @Column(name = "PROD_CD")
    private String prodCd;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "STATE")
    private String state;

    @Column(name = "WRITED_DT")
    @CreatedDate
    private Timestamp writedDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;

    @Column(name = "RESPONSER_ID")
    private String responserId;

    @Column(name = "RESPONSED_DT")
    private Timestamp responsedDt;

}
