package org.turtleswitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turtleswitch.model.OrderGroup;

public interface OrderGroupRepository extends JpaRepository<OrderGroup, String> {
}
