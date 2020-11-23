package model; 

public class Principal extends Coach implements Profitable{
	private int numberOfTeamsInCharge;
	private int championshipsWon;
	
	public Principal(String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		super(name,id,salary,yearsOfExperience);
		this.numberOfTeamsInCharge=numberOfTeamsInCharge;
		this.championshipsWon=championshipsWon;
	}

	public double calculateMarketPrice(){
		return super.getSalary() * 10 + super.getYearsOfExperience()*100 + championshipsWon*50;
	}
	
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
	