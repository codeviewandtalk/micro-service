package com.cvt.rating.service;

import com.cvt.rating.model.Rating;

import java.util.List;

public interface RatingService {

    // Create
    Rating createRating(Rating rating);

    // Get All Ratings
   List<Rating> getRating();

    // Get All by userId;
  List<Rating> getRatingByUserId(String userId);

    //Get All by Hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
