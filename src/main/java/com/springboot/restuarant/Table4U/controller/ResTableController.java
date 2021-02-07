package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.entity.Booking;
import com.springboot.restuarant.Table4U.entity.ResTable;
import com.springboot.restuarant.Table4U.service.ResTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/table")
public class ResTableController {

    @Autowired
    private ResTableService resTableService;


    @GetMapping("/getall")
    public List<ResTable> findAll(){
        System.out.println("working find all controller");
        return resTableService.getAllTables();
    }

    @GetMapping("/getPriceById")
    public Double getPriceById(@RequestParam Integer tableId){
        return resTableService.getPriceById(tableId);
    }

}
