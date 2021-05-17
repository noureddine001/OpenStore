package com.market.openstore.dao.store;

import com.market.openstore.entities.image.ImageService;
import com.market.openstore.entities.store.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Service, Long>   {
}
