package com.example.jpa_practice.domain;

import lombok.Data;

@Data
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;

}
