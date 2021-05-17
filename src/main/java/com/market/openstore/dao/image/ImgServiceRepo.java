package com.market.openstore.dao.image;

import com.market.openstore.entities.image.ImageService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImgServiceRepo extends JpaRepository<ImageService, Long>   {
}
