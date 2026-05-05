package com.telusko.controller;

import com.telusko.entity.cx.Customer;
import com.telusko.entity.pd.Product;
import com.telusko.service.ICustomerService;
import com.telusko.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeluskoController
{
    @Autowired
    private ICustomerService cxService;

    @Autowired
    private IProductService service;

    @PostMapping("/addCx")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer cx)
    {
        Customer c1 = cxService.addCustomer(cx);
        return new ResponseEntity<>(c1, HttpStatus.CREATED);
    }

    @PostMapping("/addPd")
    public ResponseEntity<Product> addPd(@RequestBody Product pd)
    {
       Product p = service.addProduct(pd);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }

    @GetMapping("/getAllCx")
    public ResponseEntity<List> getAllCxs()
    {
        List<Customer> list = cxService.getAllCustomers();
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }

    @GetMapping("/getAllPd")
    public ResponseEntity<List> getAllPds()
    {
        List<Product> list = service.getAllProducts();
        return new ResponseEntity<List>(list, HttpStatus.OK);
    }


}
