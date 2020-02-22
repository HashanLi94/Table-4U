package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.service.ResTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ResTableController {

    @Autowired
    private ResTableService resTableService;
}
