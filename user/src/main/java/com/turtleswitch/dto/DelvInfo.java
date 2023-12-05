package com.turtleswitch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DelvInfo {
    private String userId;
    private String userNm;
    private String delvDvsCd;
    private String delvDvsNm;
    private String delvAddressCd;
    private String address1;
    private String address2;
    private int zipCd;
    private String receiverNm;
    private String receiverPhoneNo;
}
