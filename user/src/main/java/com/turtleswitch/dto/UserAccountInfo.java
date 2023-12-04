package com.turtleswitch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
//    private boolean snsJoinYn;

}
