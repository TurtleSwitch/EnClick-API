package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "REVIEW")
@Getter
@Setter
public class Review {

    @Id
    @Column(name = "REVIEW_ID")
    String reviewId;

    @Column(name = "TITLE")
    String title;

    @Column(name = "CONTENT")
    String content;

    @Column(name = "IMG_URL")
    String imgUrl;

    @Column(name = "USED_YN")
    String usedYn;

    @Column(name = "REGI_DT")
    Timestamp regiDt;

    @Column(name = "UPDA_DT")
    Timestamp updaDt;
}
