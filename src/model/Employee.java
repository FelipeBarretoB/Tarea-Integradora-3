package model;

public abstract class Employee{
	private String name;
	private String id;
	private double salary;
	
	public String getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public Employee(String name, String id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
}