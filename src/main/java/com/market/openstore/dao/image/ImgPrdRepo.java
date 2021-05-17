package com.market.openstore.dao.image;

import com.market.openstore.entities.image.ImageProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImgPrdRepo extends JpaRepository<ImageProduct, Long> {
}
