package com.example.jpa_practice.repository;

import com.example.jpa_practice.domain.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
