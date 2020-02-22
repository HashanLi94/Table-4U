package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.dao.BookingRepository;
import com.springboot.restuarant.Table4U.entity.Bookings;
import com.springboot.restuarant.Table4U.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/booking")
public class BookingController {
   @Autowired
    private BookingService bookingService;

   @GetMapping("/getall")
   public List<Bookings> findAll(){
       return bookingService.findAll();
   }

   @PostMapping("/setall")
    public Bookings saveAll(@RequestBody Bookings bookings){
       System.out.println("Booking" +bookings);
       return bookingService.save(bookings);
    }


}
