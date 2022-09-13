package com.belajar.postes.services;

import com.belajar.postes.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User create(User user);
    User update(User user);
    void remove(Integer id);


}
