package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.ResEntity.AdminUserManagementEntity;
import com.springboot.restuarant.Table4U.entity.AdminUserManagement;
import com.springboot.restuarant.Table4U.service.AdminUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AdminUserManagmentController {

    @Autowired
    private AdminUserManagementService adminUserManagementService;

    @GetMapping("/users")
    public List<AdminUserManagementEntity> findAll(){
        return adminUserManagementService.allUsers();
    }



}
