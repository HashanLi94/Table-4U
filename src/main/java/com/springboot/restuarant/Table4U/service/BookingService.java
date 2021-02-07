package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.ResEntity.ResTableEntity;
import com.springboot.restuarant.Table4U.dao.BookingRepository;
import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.ResTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ResTableService resTableService;

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }


    public Booking save(Booking booking) {
        System.out.println(booking);
        return bookingRepository.save(booking);
    }

    public Integer setBookingStatusByBookingId(Integer bookingId, Integer status) {
        return bookingRepository.setBookingStatusByBookingId(bookingId, status);
    }


    public List<Booking> getAvailableBookings(int paxCount, String date, String timeSlot) throws Exception{

//        1.get available bookings
        //        2.get reserved tables list
//        3.get total tables in restaurant
//        4.return total table - reserved table
        return bookingRepository.getBookingsByDateNTimeSlotNPaxCount(paxCount, date, timeSlot);

    }

    public List<ResTableEntity> getAvailableTables(int paxCount , String date, String timeSlot)  throws Exception {

//        1.get available bookings
        List<Booking> availableBookings = this.getAvailableBookings(paxCount, date, timeSlot);
        System.out.println(availableBookings);
        //        2.get reserved tables list
        List<ResTable> reservedTableList =  new ArrayList<>();
        List<ResTableEntity> availableTableList = new ArrayList<>();
        List<ResTable> totalTableList = resTableService.getAllTables();
        System.out.println(totalTableList);
//        for (Booking booking : availableBookings) {
//            reservedTableList.addAll(booking.bookingTables);
//        }


        for (ResTable table : totalTableList) {
            ResTableEntity resTableEntity = new ResTableEntity();
            resTableEntity.setTable(table);
            resTableEntity.setAvailability(true);
            if (reservedTableList.contains(table)) {
                resTableEntity.setAvailability(false);

            }
            availableTableList.add(resTableEntity);
        }


//        3.get total tables in restaurant

//        4.return total table - reserved table
        return availableTableList;

    }
}
