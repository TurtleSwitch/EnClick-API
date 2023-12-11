package org.turtleswitch.dto;

import lombok.Data;

public class DelvMstDto {

    @Data
    public static class DelvMstReqDto {
        private String orderMstUuid;
        private String AddressUuid;
        private String delvCompCd;
    }

}
