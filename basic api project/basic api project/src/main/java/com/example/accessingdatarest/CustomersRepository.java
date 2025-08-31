package com.example.accessingdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customers2")

public interface CustomersRepository extends JpaRepository<Customers, Long> {}
