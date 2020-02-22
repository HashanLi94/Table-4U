package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.entity.AdminUserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AdminUserManagmentController {

    @Autowired
    private AdminUserManagement adminUserManagement;

}
