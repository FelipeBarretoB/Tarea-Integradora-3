package model; 

public class Principal extends Coach implements Profitable{
	//The number of teams the principal coach has been in charge 
	private int numberOfTeamsInCharge;
	//The number of championships won by the principal coach 
	private int championshipsWon;
	
	/**
	*The Overloaded constructor of the class Principal
	*Uses the constructor of the super class 
	*@param name, the name of the employee
	*@param id, the id of the employee
	*@param salary, the salary of the employee
	*@param yearsOfExperience, the years of experience of the principal coach
	*@param numberOfTeamsInCharge, the number of teams the principal coach has been in charge 
	*@param championshipsWon, the number of championships won by the principal coach 
	*/
	public Principal(String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		super(name,id,salary,yearsOfExperience);
		this.numberOfTeamsInCharge=numberOfTeamsInCharge;
		this.championshipsWon=championshipsWon;
	}
	
	@Override
	public double calculateMarketPrice(){
		return super.getSalary() * 10 + super.getYearsOfExperience()*100 + championshipsWon*50;
	}
	
	@Override
	public double calculateStars(){
		return 5+ championshipsWon/10;
	}
	
	@Override
	public String employeeToString(){
		return super.employeeToString()+
		"Numero de equipos a cargo: "+numberOfTeamsInCharge+"\n"+
		"Numero de campeonatos conseguidos"+championshipsWon+"\n"+
		"Precio de mercado: "+calculateMarketPrice()+" \n"+
		"Nivel del entrenador: "+calculateStars()+"\n";
		
	}
	
}
	