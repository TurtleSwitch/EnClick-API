package com.turtleswitch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavorDtl {
    private String FavorUUID;
    private String prodCd;
    private String prodNm;
    private String sellerUUID;
    private String sellerNm;
}
