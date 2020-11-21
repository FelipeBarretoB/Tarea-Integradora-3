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
		return 0.0;
	}
	
	public double calculateStars(){
		return 0.0;
	}
	
}
	