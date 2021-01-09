package com.devthiago.tbdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devthiago.tbdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
