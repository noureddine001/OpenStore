package com.market.openstore.dao.store;

import com.market.openstore.entities.image.ImageService;
import com.market.openstore.entities.store.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRpo extends JpaRepository<Product, Long>   {
}
