package com.example.orders.feignclient;

import com.example.orders.feignclient.request.pojo.AllCustomers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CUSTOMER-SERVICE")
public interface FiegnClient {

    @GetMapping(value = {"/customer"})
    public AllCustomers getAllCustomers();

}
