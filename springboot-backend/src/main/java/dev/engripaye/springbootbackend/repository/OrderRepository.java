package dev.engripaye.springbootbackend.repository;


import dev.engripaye.springbootbackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
