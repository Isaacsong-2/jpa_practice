package com.example.jpa_practice.domain;

import lombok.Data;


import javax.persistence.*;

@Entity
@Data
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMVER_ID")
    private String id;
    
    private String username;
    
    private String city;
    private String street;
    private String zipcode;
}
