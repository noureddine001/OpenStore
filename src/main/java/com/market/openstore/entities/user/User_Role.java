package com.market.openstore.entities.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUR;

    @ManyToOne
    private User user ;

    @ManyToOne
    private Role role ;
}
