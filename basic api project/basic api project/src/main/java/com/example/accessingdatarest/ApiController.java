package com.example.accessingdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ApiController {

    private final CustomerRepository customerRepo;
    private final CustomersRepository customersRepo;
    private final EmpRepository empRepo;
    private final OrdersRepository ordersRepo;
    private final UsersRepository usersRepo;

    public ApiController(CustomerRepository customerRepo,
                         CustomersRepository customersRepo,
                         EmpRepository empRepo,
                         OrdersRepository ordersRepo,
                         UsersRepository usersRepo) {
        this.customerRepo = customerRepo;
        this.customersRepo = customersRepo;
        this.empRepo = empRepo;
        this.ordersRepo = ordersRepo;
        this.usersRepo = usersRepo;
    }

    // ===== Customer =====
    @GetMapping("/customer")
    public List<Customer> getCustomers1() { return customerRepo.findAll(); }

    // ===== Customers =====
    @GetMapping("/customers")
    public List<Customers> getCustomers2() { return customersRepo.findAll(); }

    // ===== Employees =====
    @GetMapping("/emp")
    public List<Emp> getEmps() { return empRepo.findAll(); }

    // ===== Orders =====
    @GetMapping("/orders")
    public List<Orders> getOrders() { return ordersRepo.findAll(); }

    // ===== Users =====
    @GetMapping("/users")
    public List<Users> getUsers() { return usersRepo.findAll(); }
}
