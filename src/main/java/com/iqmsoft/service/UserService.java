package com.iqmsoft.service;

import java.util.List;

import com.iqmsoft.model.User;

public interface UserService {

    void addUser(String name);

    List<User> list();

    List<User> list(String name);
}
