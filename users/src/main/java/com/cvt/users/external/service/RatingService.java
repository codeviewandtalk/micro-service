package com.cvt.users.external.service;

import com.cvt.users.model.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ratingService")
public interface RatingService {


    @GetMapping("/rating/userId/{userId}")
    List<Rating> getRatingByUserId(@PathVariable String userId);

}
