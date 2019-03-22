package com.lsj.Login.service.dao;

import com.lsj.Login.service.damain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoginDao extends CrudRepository<User,Long>,JpaRepository<User,Long>{
    public List<User> findByUsernameAndPassword(String name, String password);
}
