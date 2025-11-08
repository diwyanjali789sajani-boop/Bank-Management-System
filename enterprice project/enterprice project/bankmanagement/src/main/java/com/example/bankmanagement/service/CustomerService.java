package com.example.bankmanagement.service;

import com.example.bankmanagement.model.Customer;
import com.example.bankmanagement.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public List<Customer> getAll() {
        return repo.findAll();
    }

    public Customer save(Customer customer) {
        return repo.save(customer);
    }

    public Customer getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

