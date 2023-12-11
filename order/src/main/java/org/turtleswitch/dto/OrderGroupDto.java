package org.turtleswitch.dto;

import jakarta.validation.constraints.Digits;
import lombok.*;
import org.turtleswitch.model.OrderGroup;

import java.sql.Timestamp;

public class OrderGroupDto {
    @Data
    public static class OrderGroupReqDto {
        private int delvCost;
        private Receipt receipt;

    }


    @Data
    public static class OrderGroupRespDto {

        private String orderStatCd;
        private int delvCost;
        private Timestamp orderDt;

        public OrderGroupRespDto(OrderGroup orderGroup) {
            this.orderStatCd = orderGroup.getOrderStatCd();
            this.delvCost = orderGroup.getDelvCost();
            this.orderDt = orderGroup.getOrderDt();
        }
    }
}
