package org.turtleswitch.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.Service.OrderService;
import org.turtleswitch.dto.OrderGroupDto;
import org.turtleswitch.dto.OrderGroupDto.OrderSaveReqDto;
import org.turtleswitch.dto.OrderGroupDto.OrderSaveRespDto;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * 주문 등록시 사용되는 컨트롤러
     * 회원 비회원 모두 동일한 메소드를 사용한다
     */
    @PostMapping("/save")
    public ResponseEntity<OrderSaveRespDto> save(@RequestBody @Valid OrderSaveReqDto requestDto, BindingResult bindingResult) {
        return new ResponseEntity<>(orderService.save(requestDto), HttpStatus.CREATED);
    }

    /**
     * 유저 아이디와 param을 받아서 적절한 주문 리스트를 조회한다
     */
    @GetMapping("/{userId}")
    public ResponseEntity<Object> orderList(@PathVariable @Valid String userId, @RequestBody @Valid Object param, BindingResult bindingResult) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    /**
     * orderMst 상태 변경
     */
    @PutMapping("/group/{stat}/{orderUuid}")
    public ResponseEntity<Object> changeStat(@PathVariable @Valid String orderUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    /**
     * orderMstUuid를 통해 주문 상세정보를 읽는다
     */
    @GetMapping("/master/{orderMstUuid}")
    public ResponseEntity<Object> getOrderDetail(@PathVariable @Valid String orderMstUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
