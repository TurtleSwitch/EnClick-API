package org.turtleswitch.dto;

import lombok.Data;

@Data
public class OrderOptionDtl {
    private String optionDetaCd; // OPTION_DETA의 PK
    private String number; // 해당 옵션을 얼마나 구매했는지 개수
}
