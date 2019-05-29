package com.xiaoze.provider.service.impl;

import com.szxfd.order.service.OrderService;
import com.szxfd.user.service.RcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("rcUserService")
public class RcUserServiceImpl implements RcUserService {

    @Autowired
    private OrderService orderService;

    @Override
    public Boolean isUserAuthed(Integer uid) {
        return orderService.hasSuccessOrder(uid);
    }
}
