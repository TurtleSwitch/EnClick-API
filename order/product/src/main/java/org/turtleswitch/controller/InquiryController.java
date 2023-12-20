package org.turtleswitch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.model.Inquiry;

import java.util.ArrayList;

@RestController
@RequestMapping("/product/inquiry")
public class InquiryController {

    @GetMapping("/")
    public ResponseEntity<?> getTable(
            @RequestParam(required = false) String userId,
            @RequestParam(required = false) String prodId){
        return new ResponseEntity<>( new ArrayList<Inquiry>(), HttpStatus.OK);
    }

    @GetMapping("/{inquiryId}")
    public ResponseEntity<?> findInquiry(@PathVariable String inquiryId){
        return new ResponseEntity<>( new ArrayList<Inquiry>(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> inquiryRegi(@RequestBody Inquiry inquiry){
        return new ResponseEntity<>(new Inquiry(), HttpStatus.OK);
    }

    @PutMapping("/{InquiryId}")
    public ResponseEntity<?> inquiryUpdate(@PathVariable String InquiryId, @RequestBody Inquiry inquiry){
        return new ResponseEntity<>(new Inquiry(), HttpStatus.OK);
    }

}
