package model;

public class Club implements ClubMethods{
	
	private String name;
	private int id;
	private String creationDate;
	private Team a;
	private Team b; 
	
	public Club(String name, int id, String creationDate, String nameA, String nameB){
		this.name=name;
		this.id=id;
		this.creationDate=creationDate;
		a =new Team(nameA);
		b =new Team(nameB);
		
	}
	
	public void fireEmployee(int index){
		
		
		
	}
	
	public int biosecurity(int rows, int colums){
		
		return 5;
		
	}
	
	public void hireEmployee(){
		
		
		
	}
	
	//public void addPlayerToTeam(String teamName, Player player);
	
	//public void addCoachOrAssitantToTeam(String teamName,Coach coach);
	
	public void hasPlayerSpace(){
		
		
		
	}
	
	public void hasCoachSpace(){
		
		
	}
	
	public void findEmployee(String name){
		
		
		
	}
	
	//public void addLineUp(Team team);
	
	public String showInfo(){
		return "pain";
		
		
	}
	
	
}