package model; 

public abstract class Coach extends Employee{
	private int yearsOfExperience;
	
	public Coach(String name, String id, double salary, int yearsOfExperience){
		super(name,id,salary);
		this.yearsOfExperience=yearsOfExperience;
	}
	
}
	