package com.turtleswitch.controller;

import com.turtleswitch.dto.CartItem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    /** 장바구니 **/
    @GetMapping("/{userId}/{cartItemUUID}")
    public ResponseEntity<CartItem> getOneCartItem(@PathVariable(name="userId") String userId, @PathVariable(name="cartItemUUID") String cartItemUUID) {
        return null;
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<CartItem>> getUserCart(@PathVariable(name="userId") String userId) {
        return null;
    }
    @PostMapping("/{userId}")
    public ResponseEntity<CartItem> addUserCartItem(@PathVariable(name="userId") String userId, @RequestBody CartItem cartItem) {
        return null;
    }
    @PutMapping("/{userId}")
    public ResponseEntity<List<CartItem>> updateUserCartItem(@PathVariable(name="userId") String userId, @RequestBody List<CartItem> cartItemList) {
        return null;
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<List<String>> deleteUserCartItem(@PathVariable(name="userId") String userId, @RequestBody List<String> cartItemUUIDList) {
        return null;
    }
}
