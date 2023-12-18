package com.turtleswitch.dto;

import com.turtleswitch.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountInfo {
    private String userId;
    private String userNm;
    private String authorityCd;
    private String joinDt;
    private boolean usedYn;

    //판매자 정보
    private SellerMapping sellerMapping;
}
