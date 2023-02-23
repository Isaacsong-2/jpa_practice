package com.example.jpa_practice.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Data
public class Address {

    private String city;
    private String street;
    private String zipcode;

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
    }
}
