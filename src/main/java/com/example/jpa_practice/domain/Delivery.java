package com.example.jpa_practice.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

//    private String city;
//    private String street;
//    private String zipcode;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

}
