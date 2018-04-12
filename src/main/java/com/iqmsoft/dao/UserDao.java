package com.iqmsoft.dao;

import org.springframework.dao.DataAccessException;

import com.iqmsoft.model.User;

import java.util.List;

public interface UserDao {

    void insertUser(String name);

    List<User> findByName(String name) throws DataAccessException;

    User findById(long id) throws DataAccessException;

    List<User> findAll() throws DataAccessException;
}
