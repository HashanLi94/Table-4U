package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.Customer;
import com.springboot.restuarant.Table4U.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/setall")
    public Customer saveAll(@RequestBody Customer customer){
        System.out.println("Booking" + customer);
        return customerService.save(customer);
    }

    @GetMapping("/getCustomerIdByNIC")
    public Integer getCustomerIdByNIC(@RequestParam String nic)  {

        try{
            return customerService.getCustomerIdByNIC(nic);
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

}
