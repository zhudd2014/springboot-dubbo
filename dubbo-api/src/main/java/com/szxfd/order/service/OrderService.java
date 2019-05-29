package com.szxfd.order.service;

public interface OrderService {

    public String createOrder(Integer uid);

    public Boolean hasSuccessOrder(Integer uid);
}
