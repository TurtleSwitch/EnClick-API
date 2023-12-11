package org.turtleswitch.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.dto.DelvMstDto.DelvMstReqDto;
import org.turtleswitch.model.DelvMst;

@RestController
@RequestMapping("/delv")
public class DelvController {

    /**
     * 배송 정보 등록
     */
    @PostMapping("/save")
    public ResponseEntity<DelvMst> save(@PathVariable @Valid DelvMstReqDto delvMstReqDto, BindingResult bindingResult) {
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    /**
     * 배송MST 정보 조회
     */
    @GetMapping("/{orderMstUuid}/{seq}")
    public ResponseEntity<?> table(@PathVariable @Valid String orderMstUuid, @PathVariable @Valid String seq, BindingResult bindingResult) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    /**
     * 배송MST 상태 변경
     */
    @PutMapping("/{stat}/{orderMstUuid}")
    public ResponseEntity<?> stat(@PathVariable @Valid String stat, @PathVariable @Valid String orderMstUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
