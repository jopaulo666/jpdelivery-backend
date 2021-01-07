package br.com.jopaulo.jpdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.jopaulo.jpdelivery.dto.OrderDTO;
import br.com.jopaulo.jpdelivery.dto.ProductDTO;
import br.com.jopaulo.jpdelivery.entities.Order;
import br.com.jopaulo.jpdelivery.entities.Product;
import br.com.jopaulo.jpdelivery.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
