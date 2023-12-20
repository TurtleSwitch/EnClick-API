package com.turtleswitch.controller;

import com.turtleswitch.dto.FavorMst;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/favor")
public class FavorController {

    /** 관심상품 **/
    @GetMapping("/{userId}/{favorUUID}")
    public ResponseEntity<FavorMst> getOneFavor(@PathVariable(name="userId") String userId, @PathVariable(name="favorUUID") String favorUUID) {
        return null;
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<FavorMst>> getUserFavors(@PathVariable(name="userId") String userId) {
        return null;
    }
    @PostMapping("/{userId}")
    public ResponseEntity<FavorMst> addUserFavor(@PathVariable(name="userId") String userId, @RequestBody FavorMst favor) {
        return null;
    }
    @PutMapping("/{userId}")
    public ResponseEntity<List<FavorMst>> updateUserFavors(@PathVariable(name="userId") String userId, @RequestBody List<FavorMst> favorList) {
        return null;
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<List<String>> deleteUserFavors(@PathVariable(name="userId") String userId, @RequestBody List<String> favorUUIDList) {
        return null;
    }
}
