package com.cvt.users.external.service;


import com.cvt.users.model.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HotelService")
public interface HotelService {


    @GetMapping("/hotel/{hotelId}")
    Hotel getHotel(@PathVariable (name="hotelId")  String hotelId);

}
