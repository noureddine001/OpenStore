package com.market.openstore.entities.categorie;

import com.market.openstore.entities.store.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departement ;
    private String nameDepart ;
    private String description ;

    @OneToMany(mappedBy = "departement")
    private Collection<Categorie> categories ;

    @OneToMany(mappedBy = "departement")
    private Collection<Store> stores ;
}
