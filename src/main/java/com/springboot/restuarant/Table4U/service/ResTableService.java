package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.ResTableRepository;
import com.springboot.restuarant.Table4U.entity.ResTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResTableService {
    @Autowired
    private ResTableRepository resTableRepository;

    public List<ResTable> getAllTables(){

        System.out.println("Get service");
        return resTableRepository.findAll();
    }

    public Double getPriceById(Integer tableId){
        return resTableRepository.getPriceById(tableId);
    }


}
