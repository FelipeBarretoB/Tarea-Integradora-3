package model;

public class Team{
	public static final int MAXPLAYERS=25;
	public static final int MAXCOACHES=4;
	private String teamName;
	private LineUp lineUp;
	private Employee[] players;
	private Employee[] coach;
	
	public Team(String teamName){
		this.teamName=teamName;
		lineUp=new LineUp();
		players=new Employee[25];
		coach=new Employee[4];
	}
	
	
	
	
}