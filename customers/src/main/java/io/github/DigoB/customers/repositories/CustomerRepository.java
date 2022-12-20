package io.github.DigoB.customers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DigoB.customers.model.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
