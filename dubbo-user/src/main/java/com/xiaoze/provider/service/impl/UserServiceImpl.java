package com.xiaoze.provider.service.impl;

import com.szxfd.user.domain.User;
import com.szxfd.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service("userService")
public class UserServiceImpl implements UserService {


    @Override
    public int addUser(User user) {
        System.out.printf("add user success");
        return new Random().nextInt(10);
    }

    @Override
    public User queryUser(Integer uid) {
        if(uid >0){
            System.out.printf("query user success");
        }
        return new User();
    }
}
