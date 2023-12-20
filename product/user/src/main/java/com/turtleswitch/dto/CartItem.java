package com.turtleswitch.dto;

import com.turtleswitch.model.CartDtl;
import com.turtleswitch.model.CartMst;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private CartMst cartMst;
    private List<CartDtl> cartDtlList;
}
