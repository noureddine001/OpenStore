package com.market.openstore.dao.store;

import com.market.openstore.entities.image.ImageService;
import com.market.openstore.entities.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store, Long>   {
}
