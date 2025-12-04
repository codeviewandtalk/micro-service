package com.cvt.users.services.impl;


import com.cvt.users.exception.ResourceNotFoundException;
import com.cvt.users.external.service.HotelService;
import com.cvt.users.external.service.RatingService;
import com.cvt.users.model.Hotel;
import com.cvt.users.model.Rating;
import com.cvt.users.model.User;
import com.cvt.users.repository.UserRepository;
import com.cvt.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RatingService ratingService;

    @Autowired
    HotelService hotelService;

    @Override
    public User saveUser(User user) {
        String randomUserID = UUID.randomUUID().toString();
        user.setUserID(randomUserID);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        // call to rating
        List<Rating> ratings = ratingService.getRatingByUserId(userId);

        System.out.println(ratings);

        List<Rating> ratingList = ratings.stream().map(rating -> {
            Hotel hotel = hotelService.getHotel(rating.getHotelId());
            rating.setHotel(hotel);
            return rating;
        }).collect(Collectors.toList());


        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given Id not found on server !! :" + userId));

        user.setRatings(ratingList);
        return user;
    }
}
