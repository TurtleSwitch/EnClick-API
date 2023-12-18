package org.turtleswitch.dto;

import lombok.Data;
import java.util.List;

@Data
public class Receipt {
    private String productId; // 제품Id
    private int productNumber; // 제품 구매 개수
    private List<OrderOptionDtl> orderOptionDtlList; // 옵션Dtl List
}
