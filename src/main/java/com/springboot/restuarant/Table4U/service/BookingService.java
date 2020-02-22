package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.BookingRepository;
import com.springboot.restuarant.Table4U.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> findAll(){
        return bookingRepository.findAll();
    }


    public Booking save(Booking booking) {
        System.out.println(booking);
        return bookingRepository.save(booking);
    }


    public List<Booking> getAvilableBookings(String date,String timeSlot)  {

        return bookingRepository.getBookingsByDateNTimeSlot(date,timeSlot);

    }
}
