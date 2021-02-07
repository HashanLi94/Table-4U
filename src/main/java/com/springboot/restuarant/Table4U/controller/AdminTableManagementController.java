package com.springboot.restuarant.Table4U.controller;


import com.springboot.restuarant.Table4U.service.AdminTableManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class AdminTableManagementController {

    @Autowired
    private AdminTableManagementService adminTableManagementService;


}
