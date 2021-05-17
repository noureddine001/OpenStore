package com.market.openstore.dao.user;

import com.market.openstore.entities.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
