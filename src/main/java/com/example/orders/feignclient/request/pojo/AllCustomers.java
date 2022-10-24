package com.example.orders.feignclient.request.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AllCustomers {

    private List<Customer> lstCustomer;
    private String message;

    public AllCustomers(List<Customer> lstCustomer) {
        this.lstCustomer = lstCustomer;
    }
}
