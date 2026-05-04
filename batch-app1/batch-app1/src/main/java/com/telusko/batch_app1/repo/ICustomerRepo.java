package com.telusko.batch_app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.batch_app1.entity.Customer;

@Repository	
public interface ICustomerRepo extends JpaRepository<Customer, Long>
{

}
