package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "OPTION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Option {

    @Id
    @Column(name = "OPTION_CD")
    private String optionCd;

    @Column(name = "STOCK")
    private Integer stock;

}
