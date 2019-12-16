package com.knikolov.rentcloud.profileservice.repository;

import com.knikolov.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
