package com.example.orders.service;

import com.example.orders.feignclient.request.pojo.AllCustomers;
import com.example.orders.service.pojo.Customer;
import com.example.orders.service.pojo.CustomerResponse;

public interface CustomerService {
    public AllCustomers getCustomer();
}
