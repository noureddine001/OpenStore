package com.market.openstore.entities.image;

import com.market.openstore.entities.store.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ImageProduct extends Image {
    @ManyToOne
    private Product product ;

}
