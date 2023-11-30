package org.turtleswitch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turtleswitch.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String returnHi() {
        return "hi";
    }

    @GetMapping("/save")
    public ResponseEntity<Boolean> SAVE() {
        return new ResponseEntity<>(orderService.save(), HttpStatus.OK);
    }
}
