package com.rating.services;

import com.rating.models.Rating;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface RatingService {

    Rating add(Rating rating);
    List<Rating> getAll();

    List<Rating> findRatingByUserId(int userId);
}
