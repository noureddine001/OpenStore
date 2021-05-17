package com.market.openstore.Service;

//@Service
public class UserService {

    /*private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    @Autowired
    public UserService(UserRepository userRepository , RoleRepository roleRepository){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository ;
    }

    ///get rolle
    public Role getRole(String roleName) {
        return roleRepository.findRoleByRoleName(roleName);
    }

    public List<User> getUsers() {
        return userRepository.findAll() ;
    }
    public Optional<User> getUser(Long id ) {
        return userRepository.findById(id);
    }

    public User getUser(String email){
        return userRepository.getUserByEmail(email);
    }

    public void addUser(User user){
        user.getRoles().add(roleRepository.findRoleByRoleName("USER"));
        userRepository.save(user);
    }

    public void addAdmin(User user) {
        user.getRoles().add(roleRepository.findRoleByRoleName("ADMIN"));
        userRepository.save(user) ;
    }

    public void removeAdmin(String email){
       User user =  userRepository.getUserByEmail(email) ;
        user.getRoles().remove(roleRepository.findRoleByRoleName("ADMIN")) ;
        userRepository.save(user) ;
    }
    public void deleteUser(String email){
        userRepository.delete(userRepository.getUserByEmail(email)) ;
    }

*/

}
