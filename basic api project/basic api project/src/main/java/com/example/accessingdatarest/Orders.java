package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private LocalDate orderDate;

    private Double amount;

    private String product;

    private String name;

    private Long customerId;   // ✅ this was missing

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getCustomerId() { return customerId; }   // ✅ FIXED
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
}
