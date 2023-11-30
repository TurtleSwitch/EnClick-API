package org.turtleswitch.Service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.turtleswitch.model.OrderGroup;
import org.turtleswitch.repository.OrderGroupRepository;

@Service
public class OrderService {

    private final JPAQueryFactory jpa;
    private final OrderGroupRepository orderGroupRepository;

    public OrderService(EntityManager entityManager, OrderGroupRepository orderGroupRepository) {
        this.jpa = new JPAQueryFactory(entityManager);
        this.orderGroupRepository = orderGroupRepository;
    }

    @Transactional
    public boolean save() {
        orderGroupRepository.save(OrderGroup.builder()
                .orderUuid("123")
                .orderStatCd("123")
                .delvCost(1000)
                .build());
        return true;
    }
}
