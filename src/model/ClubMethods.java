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
	*The method fills the dressing rooms and offices with the biosecurity protocol <br>
    *<b>pre: the creation of all dressing rooms and offices </b> 
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
	*@param index, the index of the team 
	*@param name, the name of the player
	*@param id, the id of the player
	*@param salary, the salary of the player
	*@param shirtNumber, the number on the shirt of the player 
	*@param goalsScored, the number of goals the player has scored
	*@param averageRating, the average rating of the player
	*@param position, the position of the player 
	*/
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position);
	
	
	/**
	*The method shows the employees of both teams <br>
    *<b>pre: The creation of the team array and the method teamToString() from the class Team </b> 
	*<b>post:  </b>
	*@return String, the string holds all the information from both teams
	*/
	public String showEmployee();
	
	
	/**
	*The method shows the employees of the team in the in the position of the array "index" <br>
    *<b>pre: The creation of the team array and the method teamToString() from the class Team </b> 
	*<b>post:  </b>
	*@param index, the index of the team the user wants to see
	*@return String, the string holds all the information from both teams
	*/
	public String showEmployee(int index);
	
	
	
	/**
	*The method gives the necessary variables so the class teams can create an object from the class Principal and add it to the principal variable. Adds the same Principal object to the Employee ArrayList <br>
    *<b>pre: The creation of a the team array and clubEmployees ArrayList </b> 
	*<b>post: The addition of a principal in the team, and the same object added to the clubEmployees ArrayList </b>
	*@param index, the index of the team 
	*@param name, the name of the principal
	*@param id, the id of the principal
	*@param salary, the salary of the principal
	*@param yearsOfExperience, the number on the of years the principal has of experience
	*@param numberOfTeamsInCharge, the number of teams the principal has been in charge of
	*@param championshipsWon, the number of champion ships the principal has won
	*/
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon);
	
	/**
	*The method gives the necessary variables so the class teams can create an object from the class Assistant and add it to the coach array. Adds the same Assistant object to the Employee ArrayList <br>
    *<b>pre: The creation of a the team array and clubEmployees ArrayList </b> 
	*<b>post: The addition of a coach in the team's coach array, and the same object added to the clubEmployees ArrayList </b>
	*@param index, the index of the team 
	*@param name, the name of the coach
	*@param id, the id of the coach
	*@param salary, the salary of the coach
	*@param yearsOfExperience, the number on the of years the coach has of experience
	*@param hasBeenPlayer, a boolean that holds if the coach has or hasn't been a player
	*@param skill, the skill of the coach
	*/
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill);
	
	/**
	*The method checks if a team has space for atleast one more player  <br>
    *<b>pre: The creation of the team array  </b> 
	*<b>post:  </b>
	*@param index, the index of the team 
	*@return boolean, returns true if it has space, false if it does not
	*/
	public boolean hasPlayerSpace(int index);
	
	/**
	*The method checks if a team has space for atleast one more coach  <br>
    *<b>pre: The creation of the team array  </b> 
	*<b>post:  </b>
	*@param index, the index of the team 
	*@return boolean, returns true if it has space, false if it does not
	*/
	public boolean hasCoachSpace(int index);
	
	/**
	*The method checks if a team has a principal  <br>
    *<b>pre: The creation of the team array  </b> 
	*<b>post:  </b>
	*@param index, the index of the team 
	*@return boolean, returns true if it has, false if it hasn't
	*/
	public boolean hasPrincipalSpace(int index);
	
	/**
	*The method checks for a employee and fires him from his current team<br>
    *<b>pre: The creation of the team array and the arrays in the Team class </b> 
	*<b>post: Removes an object </b>
	*@param index, the index of the team 
	*@param id, the id of the player
	*/
	public void findEmployee(String id, int index);
	
	/**
	*The method checks for a employee and returns his information<br>
    *<b>pre: The creation of the team array and the arrays in the Team class  </b> 
	*<b>post: Removes an object </b>
	*@param id, the id of the player
	@return String, the information of the player
	*/
	public String findEmployee(String id);
	
	
	
	/**
	*The method removes an employee from the club and all teams  <br>
    *<b>pre: The creation of the team array and clubEmployees ArrayList  </b> 
	*<b>post: Removes an object from the teams and clubEmployees </b>
	*@param id, the id of the employee that will be removed 
	*/
	public void fireClubEmployee(String id);
	
	/**
	*The method returns a String with all the employees in the clubEmployees ArrayList  <br>
    *<b>pre: The creation of the clubEmployees ArrayList and the method employeeToString() </b> 
	*<b>post:  </b>
	*@return String, a String that holds all the information of all the employees in clubEmployees
	*/
	public String showClubEmployees();
	
	/**
	*The method adds an employee from the clubEmployees ArrayList to a team  <br>
    *<b>pre: The creation of the clubEmployees ArrayList, the methods hasPlayerSpace, hasCoachSpace and hasPrincipalSpace, and the team array </b> 
	*<b>post: Adds a new object to a team </b>
	*@param index, the index of the team that the employee is to added
	*@param id, the id of the employee
	*/
	public void addClubEmployeeToTeam(int index, String id);
	
	/**
	*The method checks if an employee has a team  <br>
    *<b>pre: The creation of the clubEmployees ArrayList, and the team array </b> 
	*<b>post:  </b>
	*@param id, the id of the employee
	*@return boolean, returns true if the employee has space, false if it hasn't
	*/
	public boolean employeeHasTeam(String id);
	
	
	
	public boolean activeEmployee(String id);
	
	public boolean addsTen(int index, String lineUp);
	
	public void addLineUp(int index,String lineUp, String date, String tactics);
	
	//public String showOneRoom(int index);
	
	/**
	*The method returns a String with the information of all the club  <br>
    *<b>pre: The creation of the clubEmployees ArrayList, the team array,the methods showClubEmplyees(), howEmployee() and all the club's 2d arrays  </b> 
	*<b>post:  </b>
	*@return String, returns a string that holds all the information
	*/
	public String showInfo();
	
	
	
}