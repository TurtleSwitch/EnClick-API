package org.turtleswitch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.model.Category;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product/category")
public class CategoryController {

    @GetMapping("/")
    public ResponseEntity<?> getTable(){
        return new ResponseEntity<>( new ArrayList<Category>(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<?> categoryRegi(@RequestBody Category category){
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<?> categoryUpdate(@PathVariable String categoryId, @RequestBody Category category){
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }

}
