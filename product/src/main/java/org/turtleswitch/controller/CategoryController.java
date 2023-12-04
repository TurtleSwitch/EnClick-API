package org.turtleswitch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turtleswitch.model.Category;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product/category")
public class CategoryController {

    @GetMapping("/")
    public List<Category> getTable(){
        return new ArrayList<>();
    }

}
