package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;




}
