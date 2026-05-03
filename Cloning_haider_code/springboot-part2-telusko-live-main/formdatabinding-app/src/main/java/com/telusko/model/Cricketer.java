package com.telusko.model;

public class Cricketer 
{
	private Integer id;
	private String name;
	private String city="Bengaluru";
	private Double iplSalary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getIplSalary() {
		return iplSalary;
	}
	public void setIplSalary(Double iplSalary) {
		this.iplSalary = iplSalary;
	}
	public Cricketer(Integer id, String name, String city, Double iplSalary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.iplSalary = iplSalary;
	}
	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", city=" + city + ", iplSalary=" + iplSalary + "]";
	}
	
	

}
