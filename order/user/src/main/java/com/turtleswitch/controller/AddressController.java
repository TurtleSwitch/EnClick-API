package com.turtleswitch.controller;

import com.turtleswitch.model.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {

    /** 배송지 **/
    @GetMapping("/{userId}")
    public ResponseEntity<List<Address>> getUserAddress(@PathVariable(name="userId") String userId) {
        return null;
    }

    @GetMapping("/{userId}/{addressUUID}")
    public ResponseEntity<Address> getOneAddress(@PathVariable(name="userId") String userId, @PathVariable(name="addressUUID") String addressUUID) {
        return null;
    }
    @PostMapping("/{userId}")
    public ResponseEntity<Address> addUserAddress(@PathVariable(name="userId") String userId, @RequestBody Address address) {
        return null;
    }
    @PutMapping("/{userId}")
    public ResponseEntity<List<Address>> updateUserAddress(@PathVariable(name="userId") String userId, @RequestBody List<Address> addressList) {
        return null;
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<List<String>> deleteUserAddress(@PathVariable(name="userId") String userId, @RequestBody List<String> addressUUIDList) {
        return null;
    }

}
