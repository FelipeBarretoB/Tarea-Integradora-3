package model;

public class Club implements ClubMethods{
	

	private String name;
	private int id;
	private String creationDate;
	private Team a;
	private Team b; 
	private Team[] team;
	private Player[][] dressingRoom1;
	private Player[][] dressingRoom2;
	private Coach[][] office;
	
	public Club(String name, int id, String creationDate, String nameA, String nameB){
		this.name=name;
		this.id=id;
		this.creationDate=creationDate;
		a =new Team(nameA);
		b =new Team(nameB);
		team= new Team[] {new Team(nameA),new Team(nameB)};
		dressingRoom1=new Player[7][7];
		dressingRoom2=new Player[7][6];
		office=new Coach[6][6];
		
	}
	
	public String printTeamNames(){
		return "(1) "+team[0].getTeamName()+" \n"+
		"(2) "+team[1].getTeamName()+"\n";
	}
	
	public void fireEmployee(int index){
		
		
		
	}
	
	public int biosecurity(int rows, int colums){
		
		return 5;
		
	}
	
	
	
	public String getTeamsName(){
		return a.getTeamName()+" "+b.getTeamName();
	}
	
	public boolean checkId(int index,String id){
		return team[index].checkId(id);
	}
	
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position){
		team[index].addPlayer(name,id,salary,shirtNumber,goalsScored,averageRating,position);
	}
	
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		team[index].addPrincipalCoach( name,  id,  salary,  yearsOfExperience, numberOfTeamsInCharge, championshipsWon);		
	}
	
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill){
		team[index].addAssistanCoach( name,  id,  salary,  yearsOfExperience, hasBeenPlayer,  skill);
	}
	
	public void addPlayerToTeam(String teamName, Player player){
		
	}
	
	public void addCoachOrAssitantToTeam(String teamName,Coach coach){
		
	}
	
	public void hasPlayerSpace(){
		
		
		
	}
	
	public void hasCoachSpace(){
		
		
	}
	
	public void findEmployee(String name){
		
		
		
	}
	
	public void addLineUp(Team team){}
	
	
	public String showInfo(){
		return "pain";
		
		
	}
	
	
}