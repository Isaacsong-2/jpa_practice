package com.example.jpa_practice.domain.item;

import com.example.jpa_practice.domain.item.Item;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    private String etc;
}
