package com.springboot.restuarant.Table4U.dao;

import com.springboot.restuarant.Table4U.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
