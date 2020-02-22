package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings, Integer> {


}
