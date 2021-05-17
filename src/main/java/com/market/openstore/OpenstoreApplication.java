package com.market.openstore;


import com.market.openstore.dao.user.UserRepo;
import com.market.openstore.entities.user.Role;
import com.market.openstore.entities.user.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication

public class OpenstoreApplication  {



    public static void main(String[] args) {
        SpringApplication.run(OpenstoreApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepo userRepo){
        return args -> {

            User u1 = new User("elalja","noureddine") ;
            User u2 = new User("elkhali", "khadija") ;

            userRepo.save(u1) ;
            userRepo.save(u2) ;


          };
    }


}