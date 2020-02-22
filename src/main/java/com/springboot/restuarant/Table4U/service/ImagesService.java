package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesService {

    @Autowired
    private ImagesRepository imagesRepository;

    public ImagesService(ImagesRepository imagesRepository){
        this.imagesRepository = imagesRepository;
    }
}
