package com.example.accessingdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users")
public interface UsersRepository extends JpaRepository<Users, Long> {}
