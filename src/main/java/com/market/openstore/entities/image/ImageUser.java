package com.market.openstore.entities.image;

import com.market.openstore.entities.user.User;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ImageUser extends Image  {
    @ManyToOne
    private User user ;

}
