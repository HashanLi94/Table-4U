package com.springboot.restuarant.Table4U.service;


import com.springboot.restuarant.Table4U.dao.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;


}
