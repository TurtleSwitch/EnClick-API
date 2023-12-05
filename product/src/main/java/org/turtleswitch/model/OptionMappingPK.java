package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class OptionMappingPK implements Serializable {

    private String optionCd;
    private String optionDetaCd;

}
