package org.turtleswitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turtleswitch.model.OrderMst;

public interface OrderMstRepository extends JpaRepository<OrderMst, String> {
}
