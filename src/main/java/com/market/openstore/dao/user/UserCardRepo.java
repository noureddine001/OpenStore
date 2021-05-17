package com.market.openstore.dao.user;

import com.market.openstore.entities.user.UserCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCardRepo extends JpaRepository<UserCard, Long> {

}
