package org.turtleswitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turtleswitch.model.OrderDtl;
import org.turtleswitch.model.OrderDtlPK;

public interface OrderDtlRepository extends JpaRepository<OrderDtl, OrderDtlPK> {
}
