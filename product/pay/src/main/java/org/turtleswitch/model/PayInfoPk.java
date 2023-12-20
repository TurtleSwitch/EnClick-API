package org.turtleswitch.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PayInfoPk implements Serializable {
    int paySeq;
    String compCd;
    String payerId;
}
