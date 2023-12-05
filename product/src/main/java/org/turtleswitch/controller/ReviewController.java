package org.turtleswitch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.model.Option;
import org.turtleswitch.model.Review;

import java.util.ArrayList;

@RestController
@RequestMapping("/product/review")
public class ReviewController {

    @GetMapping("/")
    public ResponseEntity<?> getTable(
            @RequestParam(required = false) String prodId,
            @RequestParam(required = false) String userId){
        return new ResponseEntity<>( new ArrayList<Review>(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> reviewRegi(@RequestBody Review review){
        return new ResponseEntity<>(new Review(), HttpStatus.OK);
    }

    @PutMapping("/{reviewId}")
    public ResponseEntity<?> reviewUpdate(@PathVariable String reviewId, @RequestBody Review review){
        return new ResponseEntity<>(new Review(), HttpStatus.OK);
    }

}
