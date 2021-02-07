package com.springboot.restuarant.Table4U.service;

import com.springboot.restuarant.Table4U.dao.UserRepository;
import com.springboot.restuarant.Table4U.entity.User;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public HashMap<Integer, User> validatePasswordByEmail(String email, String password){

        List<User> userList = userRepository.validatePasswordByEmail(email);
        HashMap result = new HashMap();

        if(userList.isEmpty()){
            //Has No such User
            result.put(1,new User());
            return result;
        }
        else if(BCrypt.checkpw(password, userList.get(0).getPassword())){
            //"Login Successful"\
            result.put(2,userList.get(0));
            return result;
        }else{
            //"Wrong Password"
            result.put(3,new User());
            return result;
        }
    }
}
