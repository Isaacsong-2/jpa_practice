package com.example.jpa_practice.domain.item;

import com.example.jpa_practice.domain.Order;
import com.example.jpa_practice.domain.item.Item;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
@Data
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    private int orderPrice;
    private int count;
}
