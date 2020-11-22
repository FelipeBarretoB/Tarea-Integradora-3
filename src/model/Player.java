package model;

public class Player extends Employee implements Profitable {
	private int shirtNumber;
	private int goalsScored;
	private double averageRating;
	private Position position;
	
	public Player(String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, Position position){
		super(name,id,salary);
		this.shirtNumber=shirtNumber;
		this.goalsScored=goalsScored;
		this.averageRating=averageRating;
		this.position=position;
	}
	
	public double calculateMarketPrice(){
		return 0.0;
	}
	
	public double calculateStars(){
		return 0.0;
	}
	
	
}