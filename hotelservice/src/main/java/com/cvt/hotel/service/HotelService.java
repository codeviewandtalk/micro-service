package com.cvt.hotel.service;

import com.cvt.hotel.model.Hotel;

import java.util.List;

public interface HotelService {


    // Create hotel
    Hotel createHotel(Hotel hotel);

    //Get All Hotel
    List<Hotel> getAll();

    //Get Single Hotel
    Hotel get(String id);
}
