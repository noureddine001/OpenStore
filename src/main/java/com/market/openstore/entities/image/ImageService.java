package com.market.openstore.entities.image;

import com.market.openstore.entities.store.Service;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ImageService extends Image {
    @ManyToOne
    private Service service ;
}

