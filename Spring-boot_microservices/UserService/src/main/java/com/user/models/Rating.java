package com.user.models;

import lombok.Data;

@Data
public class Rating {
    private int id;
    private Float rating;
    private String feedback;
    private int userId;
}
