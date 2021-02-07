package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

//    @Query("SELECT b FROM Booking b where b.date = :date and b.time = :timeSlot ")
   /* @Query("SELECT b FROM Booking b Where b.date= :date AND b.time= :timeSlot ")
    List<Booking> getBookingsByDateNTimeSlot(@Param("date")String date,@Param("timeSlot") String timeSlot);*/

    @Query("SELECT b FROM Booking b Where b.date= :date AND b.time= :timeSlot AND b.paxCount= :paxCount")
    List<Booking> getBookingsByDateNTimeSlotNPaxCount(@Param("paxCount")int paxCount,@Param("date")String date,@Param("timeSlot") String timeSlot);

    @Modifying
    @Query("update Booking b set b.statusId = :status where b.bookingId = :bookingId")
    Integer setBookingStatusByBookingId(@Param("bookingId")Integer bookingId,@Param("status") Integer status);
}
