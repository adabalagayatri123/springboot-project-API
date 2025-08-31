package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String city;

        // Getters & Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
    
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    
        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
}
