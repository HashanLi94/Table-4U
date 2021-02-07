package com.springboot.restuarant.Table4U.controller;


import com.springboot.restuarant.Table4U.entity.User;
import com.springboot.restuarant.Table4U.service.LoginService;
import com.springboot.restuarant.Table4U.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/login")
public class LoginController {
   @Autowired
    private LoginService loginService;

   @PostMapping("/credentials")
   public HashMap<Integer, User> validatePasswordByEmail(@RequestBody User user){
       return loginService.validatePasswordByEmail(user.getEmail(), user.getPassword());
   }

}
