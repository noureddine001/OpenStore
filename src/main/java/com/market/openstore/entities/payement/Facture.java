package com.market.openstore.entities.payement;

import com.market.openstore.entities.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture ;
    private Date date ;
    private float totalPrix ;
    private String status ;

    @ManyToOne
    private User user ;

     @OneToMany(mappedBy = "facture")
    private Collection<Selles> selles ;
}
