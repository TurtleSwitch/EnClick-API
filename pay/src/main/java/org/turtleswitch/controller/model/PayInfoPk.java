package org.turtleswitch.controller.model;

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
