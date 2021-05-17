package com.market.openstore.entities.user;

import com.market.openstore.entities.image.ImageUser;
import com.market.openstore.entities.payement.Facture;
import com.market.openstore.entities.store.Store;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String nom;
    private String prenom ;
    private String email ;
    private String passwd ;
    private boolean activated ;

    @OneToMany(mappedBy = "user")
    private Collection<User_Role> user_roles ;

    @OneToOne(mappedBy = "boss")
    private Store store ;

    @OneToMany(mappedBy = "user")
    private Collection<ImageUser> imageUsers ;

    @OneToMany(mappedBy = "user")
    private Collection<Facture> factures ;

    @OneToMany(mappedBy = "user")
    private Collection<UserCard> userCards ;


    public User(String nom, String prenom){
        this.nom= nom ;
        this.prenom = prenom ;
    }
}
