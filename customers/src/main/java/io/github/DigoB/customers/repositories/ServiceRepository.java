package io.github.DigoB.customers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DigoB.customers.model.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    
}
