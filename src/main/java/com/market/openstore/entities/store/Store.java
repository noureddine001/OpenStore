package com.market.openstore.entities.store;

import com.market.openstore.entities.categorie.Departement;
import com.market.openstore.entities.image.ImageStore;
import com.market.openstore.entities.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
    private String nameStore;
    private String description;
    private boolean available;
    private float avis;
    private String address;

    @OneToMany(mappedBy = "store")
    private Collection<Product> products ;

    @OneToMany(mappedBy = "store")
    private Collection<Service> services ;

    @OneToOne
    private User boss ;

    @ManyToOne
    private Departement departement ;

    @OneToMany(mappedBy = "store")
    private Collection<ImageStore> imageStores ;

    @OneToMany(mappedBy = "store")
    private Collection<AbonneStore> abonneStores ;

}