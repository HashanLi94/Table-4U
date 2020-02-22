package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

//    @Query("SELECT b FROM Booking b where b.date = :date and b.time = :timeSlot ")
    @Query("SELECT b FROM Booking b Where b.date= :date AND b.time= :timeSlot ")
    List<Booking> getBookingsByDateNTimeSlot(@Param("date")String date,@Param("timeSlot") String timeSlot);

}
