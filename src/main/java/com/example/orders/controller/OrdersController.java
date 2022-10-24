package com.example.orders.controller;

import com.example.orders.service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrdersController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<?> getCustomerDetail(@PathVariable String customerId) {
        return new ResponseEntity<>(customerService.getCustomer(), HttpStatus.ACCEPTED);
    }

}
