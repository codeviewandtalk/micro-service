package com.cvt.rating.controller;

import com.cvt.rating.RatingApplication;
import com.cvt.rating.model.Rating;
import com.cvt.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class controller {


    @Autowired
    RatingService ratingService;

    @PostMapping
    ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }


    @GetMapping
    ResponseEntity<List<Rating>> getRatings(){
        return ResponseEntity.ok(ratingService.getRating());
    }

    @GetMapping("/userId/{userId}")
    ResponseEntity<List<Rating>> getRatingByUserId( @PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
}
