package com.example.jpa_practice.service;

import com.example.jpa_practice.domain.*;
import com.example.jpa_practice.domain.item.Item;
import com.example.jpa_practice.repository.ItemRepository;
import com.example.jpa_practice.repository.MemberRepository;
import com.example.jpa_practice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ItemService itemService;

    //주문
    public Long order(Long memberId, Long itemId, int count){
        //엔티티 조회
        Member member = memberRepository.getById(memberId);
        Item item = itemService.findOne(itemId);

        //배송정보 생성
        Delivery delivery = new Delivery();
        delivery.setAddress(member.getAddress());
        //주문상품 생성
        OrderItem orderItem = OrderItem.createOrderItem(item, item.getPrice(), count);
        //주문 생성
        Order order = Order.createOrder(member, delivery, orderItem);
        orderRepository.save(order);
        return order.getId();
    }

    //주문 취소
    public void cancelOrder(Long orderId){
        //주문 엔티티 조회
        Order order = orderRepository.getById(orderId);
        //주문취소
        order.cancel();
    }

    //주문검색
    public List<Order> findOrders(OrderSearch orderSearch){
        return orderRepository.findAll(orderSearch.toSpecification());
    }
}
