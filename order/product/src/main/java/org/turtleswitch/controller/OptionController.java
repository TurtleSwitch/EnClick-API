package org.turtleswitch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.model.Option;

import java.util.ArrayList;

@RestController
@RequestMapping("/product/option")
public class OptionController {

    @GetMapping("/{prodId}")
    public ResponseEntity<?> getTable(@PathVariable String prodId){
        return new ResponseEntity<>( new ArrayList<Option>(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> optionRegi(@RequestBody Option option){
        return new ResponseEntity<>(new Option(), HttpStatus.OK);
    }

    @PutMapping("/{optionId}")
    public ResponseEntity<?> optionUpdate(@PathVariable String optionId, @RequestBody Option option){
        return new ResponseEntity<>(new Option(), HttpStatus.OK);
    }
}
