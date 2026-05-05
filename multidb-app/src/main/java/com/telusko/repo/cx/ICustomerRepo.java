package com.telusko.repo.cx;

import com.telusko.entity.cx.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer, Long>
{
}
