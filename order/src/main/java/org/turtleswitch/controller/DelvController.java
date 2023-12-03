package org.turtleswitch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delv")
public class DelvController {

    @GetMapping("/")
    public String test(@RequestBody String str) {
        return str;
    }

}
