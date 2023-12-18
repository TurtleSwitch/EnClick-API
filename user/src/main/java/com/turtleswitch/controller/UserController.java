package com.turtleswitch.controller;

import com.turtleswitch.dto.UserAccountInfo;
import com.turtleswitch.dto.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    /** 회원정보 조회 **/
    @GetMapping("/{userId}")
    public ResponseEntity<UserInfo> getOneUserInfo(@PathVariable(name="userId") String userId) {
        return null;
    }
    @GetMapping("/") /*전체조회*/
    public ResponseEntity<List<UserAccountInfo>> getAllUsersInfo(@RequestParam(name="usedYn", defaultValue = "Y") char usedYn) {
        return null;
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserInfo> udpateOneUser(@PathVariable(name="userId") String userId, @RequestBody UserInfo userInfo) {
        return null;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<UserInfo> disableOneUser(@PathVariable(name="userId") String userId) {
        return null;
    }

}
