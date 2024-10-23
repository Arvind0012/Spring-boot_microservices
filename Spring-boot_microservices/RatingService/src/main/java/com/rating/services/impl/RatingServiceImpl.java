package com.rating.services.impl;

import com.rating.models.Rating;
import com.rating.repositories.RatingRepository;
import com.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository repository;

    @Override
    public Rating add(Rating rating) {
        return repository.save(rating);
    }

    @Override
    public List<Rating> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Rating> findRatingByUserId(int userId) {
        return repository.getRatingByUserId(userId);
    }

}
