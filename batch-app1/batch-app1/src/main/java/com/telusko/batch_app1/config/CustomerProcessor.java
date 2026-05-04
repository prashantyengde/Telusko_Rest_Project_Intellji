package com.telusko.batch_app1.config;

import org.springframework.batch.item.ItemProcessor;

import com.telusko.batch_app1.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> 
{

	@Override
	public Customer process(Customer item) throws Exception
	{
//		  if (item.getCountry() != null &&
//			        item.getCountry().equalsIgnoreCase("India")) {
//
//			        // optional processing
//			        item.setFirstname(item.getFirstname().toUpperCase());
//
//			        return item; // keep record
//			    }		
		return item;
	}

}
