package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.BookingTableCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommonRepository extends JpaRepository<BookingTableCustomer, Integer> {
//
//    @Query("SELECT b.bookingId as bookingId,  FROM Booking b LEFT JOIN ResTable r ON b.resTableId=r.tableNumber LEFT JOIN Customer c ON c.customerId=b.customer.customerId")
//    List<BookingTableCustomer> findAll();
}
