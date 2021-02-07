package com.springboot.restuarant.Table4U.controller;


import com.springboot.restuarant.Table4U.entity.User;
import com.springboot.restuarant.Table4U.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {
   @Autowired
    private UserService userService;

   @GetMapping("/getall")
   public List<User> findAll(){
       return userService.findAll();
   }

//    @GetMapping("/getUserById")
//    public User getUserById(){
//        return userService.getUserById();
//    }

   @PostMapping("/setall")
    public User saveAll(@RequestBody User user){
       return userService.save(user);
    }

}
