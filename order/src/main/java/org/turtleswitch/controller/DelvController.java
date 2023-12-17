package org.turtleswitch.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.Service.DelvService;
import org.turtleswitch.dto.DelvDto.DelvSaveReqDto;
import org.turtleswitch.dto.DelvDto.DelvStatSave;
import org.turtleswitch.model.DelvMst;

@RestController
@RequestMapping("/delv")
public class DelvController {

    DelvService delvService;

    public DelvController(DelvService delvService) {
        this.delvService = delvService;
    }

    /**
     * 배송 정보 등록
     */
    @PostMapping("/save")
    public ResponseEntity<DelvMst> save(@RequestBody @Valid DelvSaveReqDto delvSaveReqDto, BindingResult bindingResult) {
        return new ResponseEntity<>(delvService.save(delvSaveReqDto), HttpStatus.CREATED);
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
    @PutMapping("/stat")
    public ResponseEntity<Long> stat(@RequestBody @Valid DelvStatSave delvStatSave, BindingResult bindingResult) {
        return new ResponseEntity<>(delvService.stat(delvStatSave), HttpStatus.OK);
    }


}
