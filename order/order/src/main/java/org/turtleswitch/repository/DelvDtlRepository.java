package org.turtleswitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turtleswitch.model.DelvDtl;
import org.turtleswitch.model.DelvDtlPK;

public interface DelvDtlRepository extends JpaRepository<DelvDtl, DelvDtlPK> {
}
