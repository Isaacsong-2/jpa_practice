package com.example.jpa_practice.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import static com.example.jpa_practice.domain.OrderSpec.memberNameLike;
import static com.example.jpa_practice.domain.OrderSpec.orderStatusEq;
import static org.springframework.data.jpa.domain.Specification.where;

@Data
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;

    public Specification<Order> toSpecification(){
        return where(memberNameLike(memberName))
                .and(orderStatusEq(orderStatus));
    }

}
