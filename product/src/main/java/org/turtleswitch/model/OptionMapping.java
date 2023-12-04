package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "OPTION_MAPPING")
@Getter
@Setter
public class OptionMapping {

    @Id
    @Column(name = "OPTION_CD")
    String optionCd;

    @Id
    @Column(name = "OPTION_DETA_CD")
    String optionDetaCd;

}
