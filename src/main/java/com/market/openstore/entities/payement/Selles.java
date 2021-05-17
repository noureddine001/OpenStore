package com.market.openstore.entities.payement;



import com.market.openstore.entities.store.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Selles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSelle ;
    private int quantity ;
    private Date date ;

    @ManyToOne
    private Product product ;

    @ManyToOne
    private Facture facture ;

}
