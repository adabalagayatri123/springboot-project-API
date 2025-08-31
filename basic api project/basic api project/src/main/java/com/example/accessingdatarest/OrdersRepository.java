package com.example.accessingdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "orders")

public interface OrdersRepository extends JpaRepository<Orders, Long> {}
    