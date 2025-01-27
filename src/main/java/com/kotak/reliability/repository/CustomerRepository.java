package com.kotak.reliability.repository;

import com.kotak.reliability.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
     Optional<Customer> findById(String customerId);
}

