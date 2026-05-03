package com.telusko;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.IProductService;

@SpringBootApplication
public class Datajpa1crudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Datajpa1crudApplication.class, args);
	IProductService service = container.getBean(IProductService.class);
	
//	System.out.println(service.searchProductById(52));
//	List<Integer> ids=Arrays.asList(53,54,55);
//	service.searchProductsByIds(ids).forEach(p->System.out.println(p));
//	System.out.println(service.searchProductsByProduct(new Product("Mobile","Electronics", 5000.0, 20)));

	List<Integer> ids=Arrays.asList(3,5,52);
	//String status=service.deleteProductsByIdsCrud(ids);
	String status=service.deleteProductsByIds(ids);
	System.out.println(status);
	}

}
