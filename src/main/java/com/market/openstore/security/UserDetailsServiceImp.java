package com.market.openstore.security;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserDetailsServiceImp /*implements UserDetailsService*/ {

    /*@Autowired
    private  UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByEmail(username) ;
        if(user == null ){
            throw new UsernameNotFoundException("could not fond user");
        }
        return new MyUserDetail(user);
    }*/
}
