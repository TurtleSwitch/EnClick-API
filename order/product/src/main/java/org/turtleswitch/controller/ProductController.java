package org.turtleswitch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.dto.ProdDetailInfoDto;
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
    public ProdDetailInfoDto getDetailInfo(@PathVariable String prodId){
        return new ProdDetailInfoDto();
    }

    @PostMapping("/")
    public ProdDetailInfoDto productRegi(@RequestBody ProdDetailInfoDto prodInfo){
        return new ProdDetailInfoDto();
    }

    @PutMapping("/{prodId}")
    public ProdDetailInfoDto productUpdate(@PathVariable String prodId, @RequestBody ProdDetailInfoDto prodInfo){
        return new ProdDetailInfoDto();
    }

}
