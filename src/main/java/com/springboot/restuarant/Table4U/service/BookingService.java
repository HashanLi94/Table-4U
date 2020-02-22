package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.BookingRepository;
import com.springboot.restuarant.Table4U.entity.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Bookings> findAll(){
        return bookingRepository.findAll();
    }


    public Bookings save(Bookings bookings) {
        return bookingRepository.save(bookings);
    }
}
