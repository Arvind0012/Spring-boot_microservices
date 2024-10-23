package com.user.services;

import com.user.models.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8084", value = "Rating-Client")
public interface RatingClient {

    @GetMapping("/api/rating/{userId}")
    List<Rating> getRatingOfUser(@PathVariable int userId);
}
