package org.turtleswitch.dto;

import lombok.Data;

@Data
public class ProdInfoDto {

    private String prodCd;
    private String categoryCd;
    private String prodNm;
    private String sellerId;
    private Integer price;

}