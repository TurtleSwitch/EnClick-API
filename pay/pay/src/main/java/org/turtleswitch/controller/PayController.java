package org.turtleswitch.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.turtleswitch.dto.PayInfoDto;
import org.turtleswitch.model.PayCalcAccount;
import org.turtleswitch.model.PayComp;
import org.turtleswitch.model.PayMethod;
import org.turtleswitch.service.PayService;

import java.util.List;

@RestController
@RequestMapping("/pay")
@AllArgsConstructor
public class PayController {

    PayService payService;

    @GetMapping("/info")
    public ResponseEntity<List<PayInfoDto>> payInfoTable(){
        return payService.getAllPayInfo();
    }

    @GetMapping("/info/filterd")
    public ResponseEntity<List<PayInfoDto>> getPayInfo(PayInfoDto filter){
        return payService.getPayInfo(filter);
    }

    @PostMapping("/info")
    public ResponseEntity<Boolean> postPayInfo(PayInfoDto payInfoDto){
        return null;
    }

    @GetMapping("/info/payComp")
    public List<PayComp> payCompTable(){
        return null;
    }

    @GetMapping("/info/payComp/{payCompId}")
    public ResponseEntity<PayComp> getPayComp(@PathVariable("payCompId") String payCompId){
        return null;
    }

    @PostMapping("/info/payComp")
    public ResponseEntity<Boolean> postPayComp(PayComp payInfoDto){
        return null;
    }

    @PutMapping("/info/payComp/{payCompId}")
    public ResponseEntity<Boolean> putPayComp(PayComp payInfoDto){
        return null;
    }

    @DeleteMapping("/info/payComp/{payCompId}")
    public ResponseEntity<Boolean> deletePayComp(@PathVariable("payCompId") String payCompId){
        return null;
    }

    @GetMapping("/info/payMethod")
    public List<PayMethod> payMethodTable(){
        return null;
    }

    @GetMapping("/info/payMethod/{accountNo}")
    public ResponseEntity<PayMethod> getPayMethod(@PathVariable("accountNo") String accountNo){
        return null;
    }

    @PostMapping("/info/payMethod")
    public ResponseEntity<Boolean> postPayMethod(PayMethod payMethod){
        return null;
    }

    @PutMapping("/info/payMethod/{accountNo}")
    public ResponseEntity<Boolean> putPayMethod(PayMethod payMethod){
        return null;
    }

    @DeleteMapping("/info/payMethod/{accountNo}")
    public ResponseEntity<Boolean> deletePayMethod(@PathVariable("accountNo") String accountNo){
        return null;
    }

    @GetMapping("/info/payCalcAccount")
    public List<PayCalcAccount> payCalcAccountTable(){
        return null;
    }

    @GetMapping("/info/payCalcAccount/{accountNo}")
    public ResponseEntity<PayCalcAccount> getPayCalcAccount(@PathVariable("accountNo") String accountNo){
        return null;
    }

    @PostMapping("/info/payCalcAccount")
    public ResponseEntity<Boolean> postPayCalcAccount(PayCalcAccount payCalcAccount){
        return null;
    }

    @PutMapping("/info/payCalcAccount/{accountNo}")
    public ResponseEntity<Boolean> putPayCalcAccount(PayCalcAccount payCalcAccount){
        return null;
    }

    @DeleteMapping("/info/payCalcAccount/{accountNo}")
    public ResponseEntity<Boolean> deletePayCalcAccount(@PathVariable("accountNo") String accountNo){
        return null;
    }
}
