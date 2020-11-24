package model;

public interface ClubMethods{
	
	public void fireEmployee(String id);
	
	//public int biosecurity(int rows, int colums);
	
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position);
	
	public String showEmployee();
	
	
	
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon);
	
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill);
	
	
	public boolean hasPlayerSpace(int index);
	
	public boolean hasCoachSpace(int index);
	
	public boolean hasPrincipalSpace(int index);
	
	public void findEmployee(String id, int team);
	
	public void addLineUp(Team team);
	
	public String showInfo();
	
	
	
}