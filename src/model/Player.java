package model;

public class Player extends Employee{
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
	
	
}