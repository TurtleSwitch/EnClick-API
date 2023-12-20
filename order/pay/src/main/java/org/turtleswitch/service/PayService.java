package org.turtleswitch.service;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.turtleswitch.dto.PayInfoDto;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class PayService {

    JPAQueryFactory jq;

    public ResponseEntity<List<PayInfoDto>> getAllPayInfo(){
        try{
            return new ResponseEntity<>(PayInfoDto.getQuery(jq, null).fetch(), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<List<PayInfoDto>> getPayInfo(PayInfoDto filter){
        try{
            return new ResponseEntity<>(PayInfoDto.getQuery(jq, PayInfoDto.getBuilder(filter)).fetch(), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
        }

    }
}
