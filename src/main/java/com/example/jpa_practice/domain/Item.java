package com.example.jpa_practice.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}
