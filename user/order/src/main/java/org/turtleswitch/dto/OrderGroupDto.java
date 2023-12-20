package org.turtleswitch.dto;

import lombok.*;
import org.turtleswitch.model.OrderGroup;

import java.sql.Timestamp;
import java.util.List;

public class OrderGroupDto {
    @Data
    public static class OrderSaveReqDto {
        private int delvCost; // 배송비
        private List<Receipt> receipt; // 영수증(mst, dtl의 데이터들이 리스트로 담겨있다)

    }

    @Data
    public static class OrderSaveRespDto {
        private String orderStatCd;
        private int delvCost;
        private Timestamp orderDt;
        public OrderSaveRespDto(OrderGroup orderGroup) {
            this.orderStatCd = orderGroup.getOrderStatCd();
            this.delvCost = orderGroup.getDelvCost();
            this.orderDt = orderGroup.getOrderDt();
        }
    }

    @Data
    public static class OrderTableRespDto {
        private String orderUuid;
        private String orderStatCd;
        private int delvCost;
        private List<OrderMstTableRespDto> orderMstTableRespDtoList;
    }

    @Data
    public static class OrderMstTableRespDto {
        private String orderUuid;
        private String prodNm; // 상품이름
        private String statCd;
        private int payCost;
        private int number;
        private Timestamp regiDt; // 주문 날짜
    }


    @Data
    public static class OrderMstDtlTableRespDto {
        private String orderUuid;
        private String prodNm; // 상품이름
        private String statCd;
        private int payCost;
        private int number;
        private Timestamp regiDt; // 주문 날짜
        private List<OrderDtlTableRespDto> orderDtlTableRespDtoList;
    }

    @Data
    public static class OrderDtlTableRespDto {
        private String optionDetaNm; // 선택 옵션 이름
        private String optionDetaNumber; // 옵션 구매 개수
    }
}

