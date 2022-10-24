package com.example.orders.service;

import com.example.orders.feignclient.FiegnClient;
import com.example.orders.feignclient.request.pojo.AllCustomers;
import com.example.orders.service.pojo.Customer;
import com.example.orders.service.pojo.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private FiegnClient feignClient;

    @Override
    public AllCustomers getCustomer() {
        AllCustomers allCustomers = feignClient.getAllCustomers();
        return allCustomers;
    }
}
