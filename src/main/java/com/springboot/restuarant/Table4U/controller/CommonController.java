package com.springboot.restuarant.Table4U.controller;


import com.springboot.restuarant.Table4U.entity.BookingTableCustomer;
import com.springboot.restuarant.Table4U.entity.User;
import com.springboot.restuarant.Table4U.service.CommonService;
import com.springboot.restuarant.Table4U.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/common")
public class CommonController {

   @Autowired
    private CommonService commonService;

//   @GetMapping("/getall")
//   public List<BookingTableCustomer> findAll(){
//       return commonService.findAll();
//   }

}
