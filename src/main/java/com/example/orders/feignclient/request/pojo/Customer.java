package com.example.orders.feignclient.request.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private String address;
    private String name;
    private String id;

    public Customer(String address, String name, String id) {
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public Customer(String address, String name) {
        this.address = address;
        this.name = name;
    }
}
