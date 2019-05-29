package com.xiaoze.provider.service.impl;

import com.szxfd.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service("orderService")
public class OrderServiceImpl implements OrderService {

    public static final String ORDER_ID_PREFIX = "O";


    @Override
    public String createOrder(Integer uid) {
        String orderId = ORDER_ID_PREFIX + (1000 + new Random().nextInt(1000))*1000+uid;
        return orderId;
    }

    @Override
    public Boolean hasSuccessOrder(Integer uid) {
        if (uid % 2 == 0) {
            return true;
        }
        return false;
    }
}
