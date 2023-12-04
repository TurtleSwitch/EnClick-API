package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "LIKEY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Likey {

    @Id
    @Column(name = "REVIEW_ID")
    String reviewId;

    @Id
    @Column(name = "USER_ID")
    String userId;

}
