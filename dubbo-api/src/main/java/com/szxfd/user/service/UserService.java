package com.szxfd.user.service;

import com.szxfd.user.domain.User;

public interface UserService {

    public int addUser(User user);

    public User queryUser(Integer uid);

}
