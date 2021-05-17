package com.market.openstore.entities.categorie;

import com.market.openstore.entities.store.Product;
import com.market.openstore.entities.store.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat ;
    private String nameCat  ;
    private String description ;

    @ManyToOne
    private Departement departement ;

    @OneToMany(mappedBy = "categorie")
    private Collection<Product>  products ;

    @OneToMany(mappedBy = "categorie")
    private Collection<Service> services ;

}
