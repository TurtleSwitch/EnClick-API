package org.turtleswitch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.dto.ProdDetailInfoDto;
import org.turtleswitch.dto.ResponseDto;
import org.turtleswitch.model.Product;
import org.turtleswitch.model.ProductDetail;
import org.turtleswitch.model.ProductImg;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product/info")
public class ProductController {

    /**
     * 제품 테이블 출력
     */
    @GetMapping("/")
    public List<Product> getTable(){
        return new ArrayList<>();
    }

    /**
     * 제품 상세정보 출력
     */
    @GetMapping("/{prodId}")
    public ProdDetailInfoDto getDetailInfo(@PathVariable String prodId){
        return new ProdDetailInfoDto();
    }

    /**
     * 제품 등록
     */
    @PostMapping("/")
    public Product productRegi(@RequestBody Product prod){
        return new Product();
    }

    /**
     * 제품 정보 수정
     */
    @PutMapping("/{prodId}")
    public Product productUpdate(@PathVariable String prodId, @RequestBody Product prod){
        return new Product();
    }

    /**
     * 제품 소개글 추가
     */
    @PostMapping("/detail")
    public ProductDetail productDetailRegi(@RequestBody ProductDetail prodDeta){
        return new ProductDetail();
    }

    /**
     * 제품 소개글 수정
     */
    @PutMapping("/detail/{prodId}")
    public ProductDetail productDetailUpta(@PathVariable String prodId, @RequestBody ProductDetail prodDeta){
        return new ProductDetail();
    }

    /**
     * 제품 이미지 추가
     */
    @PostMapping("/img")
    public ProductImg productImgRegi(@RequestBody ProductImg prodImg){
        return new ProductImg();
    }

    /**
     * 제품 이미지 수정
     */
    @PutMapping("/img/{prodId}")
    public ProductImg productImgUpda(@PathVariable String prodId, @RequestBody ProductImg prodImg){
        return new ProductImg();
    }
}
