package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "OPTION")
@Getter
@Setter
public class Option {

    @Id
    @Column(name = "OPTION_CD")
    String optionCd;

    @Column(name = "STOCK")
    Integer stock;

}
