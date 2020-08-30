package pl.tfalkowski.service;


import pl.tfalkowski.model.User;

public interface UserService {
    User findByUserName(String name);

    void saveUser(User user);
    
}
