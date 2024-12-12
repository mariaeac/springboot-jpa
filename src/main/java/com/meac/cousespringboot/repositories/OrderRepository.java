package com.meac.cousespringboot.repositories;

import com.meac.cousespringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
