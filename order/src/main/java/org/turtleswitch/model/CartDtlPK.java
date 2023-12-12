package org.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CartDtlPK implements Serializable {

    @Column(name="ITEM_UUID")
    private String itemUUID;

    @Column(name="OPTION_ID")
    private String optionId;
}
