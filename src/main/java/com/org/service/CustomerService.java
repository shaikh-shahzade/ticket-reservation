package com.org.service;

import com.org.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomersById(Long id);

    Customer addCustomers(Customer customer);

    Customer updateCustomers(Customer customer);

    Customer deleteCustomers(Long id);
}
