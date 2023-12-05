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
@Table(name = "REVIEW")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {

    @Id
    @Column(name = "REVIEW_ID")
    private String reviewId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "IMG_URL")
    private String imgUrl;

    @Column(name = "USED_YN")
    private String usedYn;

    @Column(name = "REGI_DT")
    @CreatedDate
    private Timestamp regiDt;

    @Column(name = "UPDA_DT")
    @LastModifiedDate
    private Timestamp updaDt;
}
