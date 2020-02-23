package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.ResEntity.AdminUserManagementEntity;
import com.springboot.restuarant.Table4U.dao.AdminUserManagementRepository;
import com.springboot.restuarant.Table4U.entity.AdminUserManagement;
import com.springboot.restuarant.Table4U.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminUserManagementService {

    @Autowired
    private AdminUserManagementRepository adminUserManagementRepository;

    public List<AdminUserManagementEntity> allUsers() {
        List<AdminUserManagement> userDetails = adminUserManagementRepository.findAll();
        List<AdminUserManagementEntity> returnUserDetails = new ArrayList<>();
        for (int i = 0; i < userDetails.size() ; i++) {
            AdminUserManagementEntity tab = new AdminUserManagementEntity();

            tab.setFirstName(userDetails.get(i).getFirstName());
            tab.setLastName(userDetails.get(i).getLastName());


            returnUserDetails.add(tab);

        }
        return returnUserDetails;
    }
}
