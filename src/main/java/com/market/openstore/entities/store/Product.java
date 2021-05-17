package com.market.openstore.entities.store;

import com.market.openstore.entities.categorie.Categorie;
import com.market.openstore.entities.image.ImageProduct;
import com.market.openstore.entities.payement.Selles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String nameProduct;
    private String description;
    private boolean available;
    private float price;
    private int quantity;
    private float avis;

    @ManyToOne
    private Store store ;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "product")
    private Collection<ImageProduct> imageProducts ;

    @OneToMany(mappedBy = "product")
    private Collection<Selles> selles ;
}