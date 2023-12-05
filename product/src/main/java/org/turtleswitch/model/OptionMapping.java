package org.turtleswitch.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "OPTION_MAPPING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(OptionMappingPK.class)
public class OptionMapping {

    @Id
    @Column(name = "OPTION_CD")
    private String optionCd;

    @Id
    @Column(name = "OPTION_DETA_CD")
    private String optionDetaCd;

}
