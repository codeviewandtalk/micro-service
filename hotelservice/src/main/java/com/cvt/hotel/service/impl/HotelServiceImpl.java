package com.cvt.hotel.service.impl;


import com.cvt.hotel.exception.ResourceNotFoundException;
import com.cvt.hotel.model.Hotel;
import com.cvt.hotel.repository.HotelRepository;
import com.cvt.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {


    @Autowired
    HotelRepository hotelRepository;


    @Override
    public Hotel createHotel(Hotel hotel) {
        String randomHotelId = UUID.randomUUID().toString();
        hotel.setId(randomHotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel Not Found With Id: " + id));
    }
}
