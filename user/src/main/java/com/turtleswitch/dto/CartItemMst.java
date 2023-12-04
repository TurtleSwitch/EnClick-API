package com.turtleswitch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemMst {
    private String productId;
    private int delvFee;
    private int qnty;
    private List<CartItemDtl> itemOptions;

}
