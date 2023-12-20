package com.turtleswitch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CartDtlPK {

    @Column(name="ITEM_UUID")
    private String itemUUID;

    @Column(name="OPTION_CD")
    private String optionCd;
}
