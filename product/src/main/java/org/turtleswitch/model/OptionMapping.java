package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "OPTION_MAPPING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OptionMapping {

    @Id
    @Column(name = "OPTION_CD")
    String optionCd;

    @Id
    @Column(name = "OPTION_DETA_CD")
    String optionDetaCd;

}
