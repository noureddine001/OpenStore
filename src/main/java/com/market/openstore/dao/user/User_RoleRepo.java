package com.market.openstore.dao.user;

import com.market.openstore.entities.image.ImageService;
import com.market.openstore.entities.user.User_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface User_RoleRepo extends JpaRepository<User_Role, Long>   {
}
