package com.springboot.restuarant.Table4U.controller;

import com.springboot.restuarant.Table4U.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ig")
public class ImageController {

    @Autowired
    private ImageService imagesService;
}
