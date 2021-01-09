package com.devthiago.tbdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devthiago.tbdelivery.dto.OrderDTO;
import com.devthiago.tbdelivery.dto.ProductDTO;
import com.devthiago.tbdelivery.entities.Order;
import com.devthiago.tbdelivery.entities.Product;
import com.devthiago.tbdelivery.repositories.OrderRepository;
import com.devthiago.tbdelivery.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());

	}

}
