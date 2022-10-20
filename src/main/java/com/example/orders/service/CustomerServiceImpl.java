package com.example.orders.service;

import com.example.orders.service.pojo.Customer;
import com.example.orders.service.pojo.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerServiceImpl implements CustomerService {

    //RestTemplate
    //Feignclient
    //Webclient
    private String serverURL = "http://localhost:8081/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public CustomerResponse getCustomer(String customerId) {
        String finalURI = serverURL + "/customer/" + customerId;
        System.out.println(finalURI);
        ResponseEntity<CustomerResponse> customerResponseEntity = restTemplate.getForEntity(finalURI, CustomerResponse.class);
        CustomerResponse customer = customerResponseEntity.getBody();
        return customer;
    }
}
