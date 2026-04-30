package com.telusko.TouristRestAPI.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.TouristRestAPI.model.Tourist;
import com.telusko.TouristRestAPI.service.ITouristService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name="TouristInfoAPIs", description="APIs to register tourist and to get info")
public class TouristRestController 
{
	@Autowired
	private ITouristService service;
	
	
	
	@Operation(
		    summary = "Create Tourist",
		    description = "Accepts tourist details in JSON format and returns the generated tourist ID."
		)
	@PostMapping("/reg-tourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist)
	{
		String res=service.registerTourist(tourist);
		System.out.println(tourist);
		return new ResponseEntity<String>(res, HttpStatus.CREATED);
	}
	
	
	@Operation(
		    summary = "Gets Tourist Info",
		    description = "Accepts tourist id and returns the Tourist data."
		)
	@GetMapping("/get-tourist/{id}")
	public ResponseEntity<?> getTourist(@PathVariable("id") Integer id)
	{
		try
		{
			Tourist tourist = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@Operation(
		    summary = "GET Operation",
		    description = "Generates All Tourist Info"
		)
	@GetMapping("/get-tourists")
	public ResponseEntity<List> getAllTourist()
	{
		List<Tourist> tourists = service.fetchAllTouristInfo();
		return new ResponseEntity<List>(tourists, HttpStatus.OK);
	}
	
	@Operation(
		    summary = "update tourist Operation",
		    description = "Accepts Tourist info to update andb returns status of update"
		)
	@PutMapping("/update-tourist")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist)
	{
		try
		{
			String res=service.updateTouristInfo(tourist);
			return new ResponseEntity<String>(res, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@Operation(
		    summary = "update tourist budget",
		    description = "Accepts Tourist new budget to update and returns status of update"
		)
	@PatchMapping("/update-tourist-budget/{id}/{newBudget}")
	public ResponseEntity<String> updateTourist(@PathVariable("id")Integer id, @PathVariable("newBudget")Double newBudget)
	{
		try
		{
			String res=service.updateTheTouristBudget(id,newBudget);
			return new ResponseEntity<String>(res, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@Operation(
		    summary = "delete tourist Operation",
		    description = "Accepts Tourist id  and  returns status of deletion"
		)
	@DeleteMapping("/delete-tourist/{id}")
	public ResponseEntity<String> updateTourist(@PathVariable("id")Integer id) 
	{
		try
		{
			String res=service.deleteTouristInfo(id);
			return new ResponseEntity<String>(res, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}

}








