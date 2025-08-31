package com.example.accessingdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "customers1") // ✅ unique path

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

