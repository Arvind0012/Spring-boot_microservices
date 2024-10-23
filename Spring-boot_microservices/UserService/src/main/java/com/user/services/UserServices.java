package com.user.services;

import com.user.models.User;

import java.util.List;

public interface UserServices {

    User add(User user);
    List<User> getAll();
    User get(int id);

}
