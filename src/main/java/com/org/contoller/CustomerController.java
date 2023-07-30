package com.org.contoller;

import com.org.model.Customer;
import com.org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }
    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable Long id)
    {
        return customerService.getCustomersById(id);
    }
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomers(customer);
    }
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        return customerService.updateCustomers(customer);
    }
    @DeleteMapping
    public Customer deleteCustomer(@RequestBody Long id)
    {
        return customerService.deleteCustomers(id);
    }
}
