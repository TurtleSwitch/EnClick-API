package org.turtleswitch.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

public class DelvDto {

    @Data
    public static class DelvSaveReqDto {
        private String orderMstUuid;
        private String addressUuid;
        private String delvCompCd;
    }

    @Data
    public static class DelvTableRespDto {
        private String orderMstUuid;
        private String trackingId;
        private String addressName;
        private String delvCompNm;
        private String delvStatNm;
        private String usedYn;
        private List<DelvDtlTableRespDto> delvDtlTableRespDtoList;
    }

    @Data
    public static class DelvDtlTableRespDto {
        private String OrdermstUuid;
        private String delvSeq;
        private String pos;
        private Timestamp arrivalDt;
    }

}
