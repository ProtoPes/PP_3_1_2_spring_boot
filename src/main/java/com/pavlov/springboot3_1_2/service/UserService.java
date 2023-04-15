package com.pavlov.springboot3_1_2.service;



import com.pavlov.springboot3_1_2.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getAll();

    void delete(long id);

    void update(User user);

    User get(long id);
}
