package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    String optionCd;

    @Column(name = "STOCK")
    Integer stock;

}
