package com.telusko.repo.pd;

import com.telusko.entity.pd.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Long>
{
}
