package com.org.serviceimpl;


import com.org.model.Customer;
import com.org.repository.CustomerRepo;
import com.org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer getCustomersById(Long id) {
        return customerRepo.findBy(id).get();
    }

    @Override
    public Customer addCustomers(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomers(Customer customer) {
        return null;
    }

    @Override
    public Customer deleteCustomers(Long id) {
        return null;
    }
}
