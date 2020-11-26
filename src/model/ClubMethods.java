package model;

public interface ClubMethods{
	
	/**
	*The method returns the names of the teams in the club <br>
    *<b>pre: The creation of the two teams and the method getTeamName() </b> 
	*<b>post: </b>
	*@return String, the names of the teams with numbers before them
	*/
	public String printTeamNames();
	
	/**
	*The method removes a employee using the employee's id to find him <br>
    *<b>pre: The creation of the two teams, and the existance of the player array, coach array and principal variables </b> 
	*<b>post: The removal of a employee from one of the teams, changing one of the arrys or the principal variable from one of the teams </b>
	*@param id, a String that holds the id of the user 
	*/
	public void fireEmployee(String id);
	
	/**
	*The method  <br>
    *<b>pre:  </b> 
	*<b>post:  </b>
	*/
	public void biosecurity();
	
	
	/**
	*The method checks for an id in the clubEmployees, and returns true if it can find it, false if it can't <br>
    *<b>pre: The creation of the clubEmployees ArrayList </b> 
	*<b>post:  </b>
	*@param id, String that holds the id given by the user 
	*@return boolean, the boolean that represents if the methods could or could not found the id
	*/
	public boolean checkId(String id);
	
	/**
	*The method gives the necessary variables so the class teams can create an object from the class Player and add it to the player array. Adds the same Player object to the Employee ArrayList <br>
    *<b>pre: The creation of a the team array and clubEmployees ArrayList </b> 
	*<b>post: The addition of a new Player object in the team's player array, and the same object added to the clubEmployees ArrayList </b>
	*@param id, a String that holds the id of the user 
	*/
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position);
	
	
	/**
	*The method show the employees of both teams <br>
    *<b>pre: The creation of the team array and the method teamToString() from the class Team </b> 
	*<b>post:  </b>
	*@return String, the string holds all the information from both teams
	*/
	public String showEmployee();
	
	
	
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon);
	
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill);
	
	
	public boolean hasPlayerSpace(int index);
	
	public boolean hasCoachSpace(int index);
	
	public boolean hasPrincipalSpace(int index);
	
	public void findEmployee(String id, int team);
	
	public void addLineUp(int index);
	
	public String showInfo();
	
	
	
}