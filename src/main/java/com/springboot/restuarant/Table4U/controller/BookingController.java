package com.springboot.restuarant.Table4U.controller;


import com.springboot.restuarant.Table4U.ResEntity.ResTableEntity;
import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.ResTable;
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
   public List<Booking> findAll(){
       return bookingService.findAll();
   }

   @PostMapping("/setall")
    public Booking saveAll(@RequestBody Booking booking){
       System.out.println("Booking" + booking);
       return bookingService.save(booking);
    }


    /*
      Return Available bookings For a Given Date And Time Slot
     */
    @GetMapping("/getAvailableBooking")
    public List<Booking> getAvailableBookings(@RequestParam String sDate,@RequestParam String timeSlot)  {

        try{
            return bookingService.getAvailableBookings(sDate,timeSlot);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }


    }

    @GetMapping("/getAvailableTables")
    public List<ResTableEntity> getAvailableTables(@RequestParam String sDate, @RequestParam String timeSlot)  {

        try{
            System.out.println(sDate);
            return bookingService.getAvailableTables(sDate,timeSlot);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }


    }



}
