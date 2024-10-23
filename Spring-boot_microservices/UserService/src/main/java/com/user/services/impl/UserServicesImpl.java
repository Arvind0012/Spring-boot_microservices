package com.user.services.impl;

import com.user.models.User;
import com.user.repositories.UserRepository;
import com.user.services.RatingClient;
import com.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    UserRepository repository;

    @Autowired
    RatingClient ratingClient;

    @Override
    public User add(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        List<User> users = repository.findAll();
        List<User> userList = users.stream().map(user -> {
            user.setRatings(ratingClient.getRatingOfUser(user.getId()));
            return user;
        }).collect(Collectors.toList());
        return userList;
    }

    @Override
    public User get(int id) {
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setRatings(ratingClient.getRatingOfUser(user.getId()));
        return user;
    }
}
