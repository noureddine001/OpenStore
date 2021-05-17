package com.market.openstore.entities.store;

import com.market.openstore.entities.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class AbonneStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAbonne ;
    private String status ;

    @ManyToOne
    private User user;

    @ManyToOne
    private Store store ;


}
