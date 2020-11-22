package model;

public interface ClubMethods{
	
	public void fireEmployee(int index);
	
	public int biosecurity(int rows, int colums);
	
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position);
	
	public String getTeamsName();
	
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon);
	
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill);
	
	public void addPlayerToTeam(String teamName, Player player);
	
	public void addCoachOrAssitantToTeam(String teamName,Coach coach);
	
	public void hasPlayerSpace();
	
	public void hasCoachSpace();
	
	public void findEmployee(String name);
	
	public void addLineUp(Team team);
	
	public String showInfo();
	
	
	
}