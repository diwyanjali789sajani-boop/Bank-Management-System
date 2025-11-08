package com.example.bankmanagement.repository;



import com.example.bankmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

