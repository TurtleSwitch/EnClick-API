package org.turtleswitch.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DelvStatCd {
    STANDBY("대기상태"), DROPOFF("집하"), CENTER("센터도착"), CAMP("캠프도착"), DELVSTART("배송출발"), DELVEND("배송완료");

    private String value;
}
