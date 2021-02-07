package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.ResEntity.ResTableEntity;
import com.springboot.restuarant.Table4U.dao.BookingRepository;
import com.springboot.restuarant.Table4U.dao.CommonRepository;
import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.BookingTableCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {

    @Autowired
    private CommonRepository commonRepository;


//    public List<BookingTableCustomer> findAll() {
//        return commonRepository.findAll();
//    }
}
