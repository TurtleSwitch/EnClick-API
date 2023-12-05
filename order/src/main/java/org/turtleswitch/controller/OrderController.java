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

    /**
     * 주문 등록시 사용되는 컨트롤러
     * 회원 비회원 모두 동일한 메소드를 사용한다
     */
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody @Valid OrderGroupReqDto requestDto, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "주문 성공", null), HttpStatus.CREATED);
    }

    /**
     * 유저 아이디와 param을 받아서 적절한 주문 리스트를 조회한다
     */
    @GetMapping("/{userId}")
    public ResponseEntity<?> orderList(@PathVariable @Valid String userId, @RequestBody @Valid Object param, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "유저 주문 리스트 획득 성공", null), HttpStatus.OK);
    }

    /**
     * orderMst 상태 변경
     */
    @PutMapping("/group/{stat}/{orderUuid}")
    public ResponseEntity<?> changeStat(@PathVariable @Valid String orderUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "주문 상태 변경 성공", null), HttpStatus.OK);
    }

    /**
     * orderMstUuid를 통해 주문 상세정보를 읽는다
     */
    @GetMapping("/master/{orderMstUuid}")
    public ResponseEntity<?> getOrderDetail(@PathVariable @Valid String orderMstUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "주문 정보 조회 성공", null), HttpStatus.OK);
    }
}
