package br.com.jopaulo.jpdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jopaulo.jpdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
