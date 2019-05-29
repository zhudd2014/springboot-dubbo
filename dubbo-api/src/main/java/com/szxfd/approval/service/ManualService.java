package com.szxfd.approval.service;


import com.alibaba.dubbo.common.json.JSONObject;

public interface ManualService {

    public JSONObject approvalOrder(String orderId);
}
