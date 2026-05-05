package com.telusko.service;

import com.telusko.entity.cx.Customer;
import com.telusko.repo.cx.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService
{
    @Autowired
    private ICustomerRepo cxRepo;

    @Override
    public Customer addCustomer(Customer cx) {
        return cxRepo.save(cx);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return cxRepo.findAll();
    }
}
