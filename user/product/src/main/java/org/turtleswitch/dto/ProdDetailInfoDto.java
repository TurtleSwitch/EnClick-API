package org.turtleswitch.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProdDetailInfoDto {

    private String prodCd;

    private String categoryCd;

    private String prodNm;

    private String sellerId;

    private Integer price;

    private Timestamp regiDt;
    
    private Timestamp updaDt;

}
