package com.cvt.hotel.controller;

import com.cvt.hotel.model.Hotel;
import com.cvt.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class Controller {


    @Autowired
    HotelService hotelService;


    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel hotel1 = hotelService.createHotel(hotel);
        return new ResponseEntity<>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getHotel() {
        List<Hotel> hotels = hotelService.getAll();
        return new ResponseEntity<>(hotels, HttpStatus.CREATED);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        Hotel hotels = hotelService.get(hotelId);
        return new ResponseEntity<>(hotels, HttpStatus.CREATED);
    }


}
