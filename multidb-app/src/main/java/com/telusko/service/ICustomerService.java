package com.telusko.service;

import com.telusko.entity.cx.Customer;


import java.util.List;

public interface ICustomerService
{
    public Customer addCustomer(Customer cx);
    List<Customer> getAllCustomers();

}

