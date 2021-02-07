package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.CustomerRepository;
import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        System.out.println(customer);
        return  customerRepository.save(customer);
    }

    public Integer getCustomerIdByNIC(@RequestParam String nic)  {
        try{
            List<Customer> customerList = customerRepository.findAll();
            return customerRepository.getCustomerIdByNIC(nic);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }


}
