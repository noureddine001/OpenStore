package com.market.openstore.entities.image;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor  @NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Image {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idImage ;
    private String url ;
    private String description ;


}
