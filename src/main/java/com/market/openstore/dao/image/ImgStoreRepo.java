package com.market.openstore.dao.image;

import com.market.openstore.entities.image.ImageStore;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ImgStoreRepo extends JpaRepository<ImageStore, Long>   {
}
