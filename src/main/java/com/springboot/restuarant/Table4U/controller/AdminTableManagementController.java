package com.springboot.restuarant.Table4U.controller;


import com.springboot.restuarant.Table4U.service.AdminTableManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AdminTableManagementController {

    @Autowired
    private AdminTableManagementService adminTableManagementService;


}
