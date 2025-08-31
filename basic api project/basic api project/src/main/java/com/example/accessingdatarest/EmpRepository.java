package com.example.accessingdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees")

public interface EmpRepository extends JpaRepository<Emp, Long> {}
