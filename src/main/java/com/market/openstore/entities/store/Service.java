package com.market.openstore.entities.store;

import com.market.openstore.entities.categorie.Categorie;
import com.market.openstore.entities.image.ImageService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService ;
    private String nameService ;
    private String description ;
    private String address ;
    private boolean available ;
    private float price ;

    @ManyToOne
    private Store store;

    @ManyToOne
    private Categorie categorie ;

    @OneToMany(mappedBy = "service")
    private Collection<ImageService> imageServices ;


}
