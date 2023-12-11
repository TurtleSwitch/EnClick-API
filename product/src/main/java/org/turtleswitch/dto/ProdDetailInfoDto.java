package org.turtleswitch.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.sql.Timestamp;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data
public class ProdDetailInfoDto {

    private String prodCd;
    private String categoryCd;
    private String prodNm;
    private String sellerId;
    private Integer price;
    private String Intr; // 소개 글 (PRODUCT_DETAIL)
    private String imgUrl; // 소개 이미지 (PRODUCT_IMG)
}
