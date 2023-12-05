package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Embeddable
public class OptionMappingPK implements Serializable {

    @Column(name = "OPTION_CD")
    private String optionCd;

    @Column(name = "OPTION_DETA_CD")
    private String optionDetaCd;

}
