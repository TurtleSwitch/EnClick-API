package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

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
    String inquiryCd;

    @Column(name = "PROD_CD")
    String prodCd;

    @Column(name = "TITLE")
    String title;

    @Column(name = "CONTENT")
    String content;

    @Column(name = "STATE")
    String state;

    @Column(name = "WRITED_DT")
    Timestamp writedDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;

    @Column(name = "RESPONSER_ID")
    String responserId;

    @Column(name = "RESPONSED_DT")
    Timestamp responsedDt;

}
