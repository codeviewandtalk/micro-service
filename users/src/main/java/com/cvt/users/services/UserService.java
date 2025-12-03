package com.cvt.users.services;



import com.cvt.users.model.User;

import java.util.List;

public interface UserService {

    // Create user
    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);


    // TODO: delete
    //TODO:  update
}
