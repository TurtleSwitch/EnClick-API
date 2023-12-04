package org.turtleswitch.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.turtleswitch.model.OrderGroup;

import java.sql.Timestamp;

public class OrderGroupDto {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OrderGroupReqDto {

        @Size(min = 4, max = 4, message = "문자열은 정확히 4개여야합니다.")
        private String orderUuid;

        @Size(min = 3, max = 3, message = "공통코드는 정확히 3자리여야합니다.")
        private String orderStatCd;

        @Digits(integer = 4, fraction = 0, message = "배달비는 4자릿수 이하의 양의정수만 가능합니다.")
        private int delvCost;
    }


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
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
