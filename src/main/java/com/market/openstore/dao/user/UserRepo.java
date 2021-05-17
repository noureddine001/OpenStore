package com.market.openstore.dao.user;

import com.market.openstore.entities.image.ImageService;
import com.market.openstore.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>   {
}
