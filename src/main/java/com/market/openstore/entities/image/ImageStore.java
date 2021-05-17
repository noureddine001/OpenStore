package com.market.openstore.entities.image;

import com.market.openstore.entities.store.Store;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ImageStore extends Image  {
    @ManyToOne
    private Store store;
}
