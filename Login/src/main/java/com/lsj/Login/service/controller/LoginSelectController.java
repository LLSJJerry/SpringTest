package com.lsj.Login.service.controller;


import com.lsj.Login.service.damain.User;
import com.lsj.Login.service.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginSelectController {
    @Autowired
    private LoginDao loginDao;

    @GetMapping(value = "LoginSelect")
    public List<User> Loginlist(){return loginDao.findAll();}

}
