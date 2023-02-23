package com.example.jpa_practice.domain;

import lombok.Data;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private String id;
    
    private String username;
    
//    private String city;
//    private String street;
//    private String zipcode;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();
}
