package org.turtleswitch.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.dto.ResponseDto;

@RestController
@RequestMapping("/delv")
public class DelvController {

    /**
     * 배송 정보 등록
     */
    @PostMapping("/save/{orderMstUuid}")
    public ResponseEntity<?> save(@PathVariable @Valid String orderMstUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "배송 등록 성공", null), HttpStatus.CREATED);
    }

    /**
     * 배송MST 정보 조회
     */
    @GetMapping("/{orderMstUuid}")
    public ResponseEntity<?> table(@PathVariable @Valid String orderMstUuid, @RequestBody @Valid Object param, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "배송 정보 조회 성공", null), HttpStatus.OK);
    }

    /**
     * 배송MST 상태 변경 성공
     */
    @PutMapping("/{stat}/{orderMstUuid}")
    public ResponseEntity<?> stat(@PathVariable @Valid String stat, @PathVariable @Valid String orderMstUuid, BindingResult bindingResult) {
        return new ResponseEntity<>(new ResponseDto<>(1, "배송 상태 변경 성공", null), HttpStatus.OK);
    }

}
