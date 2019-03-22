package com.lsj.Login.service.service;


import com.lsj.Login.service.damain.User;
import com.lsj.Login.service.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public boolean verifyLogin(User user){

        List<User> userList = loginDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        return userList.size()>0;
    }
}
