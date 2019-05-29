package com.xiaoze.provider.service.impl;

import com.szxfd.order.service.OrderService;
import com.szxfd.user.domain.User;
import com.szxfd.user.service.RcUserService;
import com.szxfd.user.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Component
public class CreditAuthFlow implements InitializingBean {

    @Autowired
    private UserService userService;

    @Autowired
    private RcUserService rcUserService;

    @Autowired
    private OrderService orderService;

    @Override
    public void afterPropertiesSet() throws Exception {
        //1.创建用户
        User user = new User();
        user.setUid(1);
        user.setName("lookzhang");
        int uid = userService.addUser(user);

        //2.生成订单
        String order = orderService.createOrder(uid);
        if(StringUtils.isEmpty(order)){
            System.out.println("createOrder error");
            return;
        }

        //3.判断用户有无授信
        Boolean userAuthed = rcUserService.isUserAuthed(uid);

        System.out.println("userAuthed = " + userAuthed);

    }
}
