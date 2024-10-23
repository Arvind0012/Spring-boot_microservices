package com.rating.controllers;

import com.rating.models.Rating;
import com.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @PostMapping
    public Rating create(@RequestBody Rating rating){
        return ratingService.add(rating);
    }

    @GetMapping
    public List<Rating> allRating(){
        return ratingService.getAll();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int userId){
        return ResponseEntity.ok(ratingService.findRatingByUserId(userId));
    }

}
