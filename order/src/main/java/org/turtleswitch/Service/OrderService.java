package org.turtleswitch.Service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.turtleswitch.dto.OrderGroupDto.OrderSaveReqDto;
import org.turtleswitch.dto.OrderGroupDto.OrderSaveRespDto;
import org.turtleswitch.model.OrderGroup;
import org.turtleswitch.repository.OrderGroupRepository;

import java.util.UUID;

@Service
public class OrderService {

    private final JPAQueryFactory jpa;
    private final OrderGroupRepository orderGroupRepository;

    public OrderService(EntityManager entityManager, OrderGroupRepository orderGroupRepository) {
        this.jpa = new JPAQueryFactory(entityManager);
        this.orderGroupRepository = orderGroupRepository;
    }

    @Transactional
    public OrderSaveRespDto save(OrderSaveReqDto orderSaveReqDto) {

        orderGroupRepository.save(OrderGroup.builder()
                        .orderUuid(UUID.randomUUID().toString())
                        .orderStatCd("0001")
                        .delvCost(orderSaveReqDto.getDelvCost())
                .build());


        return null;
    }
}
