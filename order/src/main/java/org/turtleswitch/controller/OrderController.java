package org.turtleswitch.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.Service.OrderService;
import org.turtleswitch.dto.OrderGroupDto.OrderGroupReqDto;
import org.turtleswitch.dto.ResponseDto;

@RestController
@RequestMapping("/order")
public class OrderController {
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody @Valid OrderGroupReqDto requestDto, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "주문 저장 성공", orderService.save(requestDto)), HttpStatus.CREATED);
    }
}
