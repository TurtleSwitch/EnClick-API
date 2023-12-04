package org.turtleswitch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.dto.ProdDetailInfo;
import org.turtleswitch.dto.ResponseDto;
import org.turtleswitch.model.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product/info")
public class ProductController {

    @GetMapping("/")
    public List<Product> getTable(){
        return new ArrayList<>();
    }

    @GetMapping("/{prodId}")
    public ProdDetailInfo getDetailInfo(@PathVariable String prodId){
        return new ProdDetailInfo();
    }

    @PostMapping("/")
    public ProdDetailInfo productRegi(@RequestBody ProdDetailInfo prodInfo){
        return new ProdDetailInfo();
    }

    @PutMapping("/{prodId}")
    public ProdDetailInfo productUpdate(@PathVariable String prodId, @RequestBody ProdDetailInfo prodInfo){
        return new ProdDetailInfo();
    }

}
