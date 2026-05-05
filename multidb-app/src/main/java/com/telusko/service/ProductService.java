package com.telusko.service;

import com.telusko.entity.pd.Product;
import com.telusko.repo.pd.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService
{
    @Autowired
    private IProductRepo pdRepo;
    @Override
    public Product addProduct(Product pd) {
        return pdRepo.save(pd);
    }

    @Override
    public List<Product> getAllProducts() {
        return pdRepo.findAll();
    }
}
