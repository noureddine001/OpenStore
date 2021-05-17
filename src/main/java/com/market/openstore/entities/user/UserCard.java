package com.market.openstore.entities.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class UserCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCard ;
    private String CardIdentity  ;
    private String password ;

    @ManyToOne
    private User user ;

}
