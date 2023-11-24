package com.online_cake_order.online_cake_order.entity.repository;

import com.online_cake_order.online_cake_order.entity.entity.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
