package model;
import java.util.ArrayList;

public class Team{
	//constant that holds the maximun amount of players permited
	public static final int MAXPLAYERS=25;
	//constant that holds the maximun amount of assistant coaches
	public static final int MAXCOACHES=3;
	//the name of the team
	private String teamName;
	//ArrayList that holds the team's lineUps
	private ArrayList <LineUp> lineUp;
	//the principal coach of the team
	private Principal principal;
	//Array that holds the amount of players in the team
	private Player[] player;
	//Array that holds the assistant coachs of the team
	private Coach[] assistantCoach;
	
	/**
	*The Overloaded constructor of the class Club
	*Gives teamName a value
	*Initializes lineUp ArrayList
	*Initializes the player array
	*Initializes the coach arrray
	*@param teamName, the name of the team
	*/
	public Team(String teamName){
		this.teamName=teamName;
		lineUp=new ArrayList<>();
		player=new Player[MAXPLAYERS];
		assistantCoach=new Coach[MAXCOACHES];
	}
	
	/**
	*The method checks if there is at least one free space in the player array  <br>
    *<b>pre: The creation of the player array  </b> 
	*<b>post:  </b>
	*@return boolean, returns true if it has space, false if it does not
	*/
	public boolean hasPlayerSpace(){
		boolean hasSpace=false;
		for(int c=0;c<player.length&&!hasSpace;c++){
			if(player[c]==null)
				hasSpace=true;
		}
		return hasSpace;
	}
	
	/**
	*The method checks if there is at least one free space in the assistantCoach array  <br>
    *<b>pre: The creation of the player array  </b> 
	*<b>post:  </b>
	*@return boolean, returns true if it has space, false if it does not
	*/
	public boolean hasAssistantSpace(){
		boolean hasSpace=false;
		for(int c=0;c<assistantCoach.length&&!hasSpace;c++){
			if(assistantCoach[c]==null)
				hasSpace=true;
		}
		return hasSpace;
	}
	
	/**
	*The method checks if there is a principal coach  <br>
    *<b>pre:   </b> 
	*<b>post:  </b>
	*@return boolean, returns true if it has space, false if it does not
	*/
	public boolean hasPrincipalSpace(){
		boolean hasSpace=false;
			if(principal==null)
				hasSpace=true;
		return hasSpace;
	}

	/**
	*The method checks if there is an employee with this id  <br>
    *<b>pre:   </b> 
	*<b>post:  </b>
	*@param id, the id of the employee
	*@return boolean, returns true if it find an employee with this id, false if it does not
	*/
	public boolean checkId(String id){
		boolean found=false;

		for(int c=0;(c<player.length && player[c]!=null)&&!found;c++){
			if(player[c].getId().equals(id)){
				found=true;
			}
		}
		for(int c=0;(c<assistantCoach.length && assistantCoach[c]!=null)&&!found;c++){
			if(assistantCoach[c].getId().equals(id)){
				found=true;
			}
		}
		
		if(principal!=null && principal.getId().equals(id)){
			found=true;
		}
		
		return found;
	}
	
	/**
	*The method searchs for an employee and removes it  <br>
    *<b>pre: The creation of the assistantCoach and player arrays, and the principal field  </b> 
	*<b>post: Can change the value of the assistantCoach, player arrays, or the principal field </b>
	*@param id, the id of the employee that will be removed
	*/
	public void fireEmployee(String id){
		boolean found=false;

		for(int c=0;(c<player.length && player[c]!=null)&&!found;c++){
			if(player[c].getId().equals(id)){
				player[c]=null;
				found=true;
			}
		}
		for(int c=0;(c<assistantCoach.length && assistantCoach[c]!=null)&&!found;c++){
			if(assistantCoach[c].getId().equals(id)){
				assistantCoach[c]=null;
				found=true;
			}
		}
		
		if(principal!=null && principal.getId().equals(id)){
			principal=null;
			found=true;
		}
	}
	
	/**
	*The method searchs for an employee and returns the Employee  <br>
    *<b>pre: The creation of the assistantCoach and player arrays, and the principal field  </b> 
	*<b>post:  </b>
	*@param id, the id of the employee that will be removed
	*@return Employee, the employee that has the same id
	*/
	public Employee findEmployee(String id){
		boolean found=false;
		Employee print=null;
		for(int c=0;(c<player.length && player[c]!=null)&&!found;c++){
			if(player[c].getId().equals(id)){
				print=player[c];
				found=true;
			}
		}
		for(int c=0;(c<assistantCoach.length && assistantCoach[c]!=null)&&!found;c++){
			if(assistantCoach[c].getId().equals(id)){
				print=assistantCoach[c];
				found=true;
			}
		}
		
		if(principal!=null && principal.getId().equals(id)){
			print=principal;
			found=true;
		}
		
		return print;
		
	}
	
	/**
	*The method returns the name of the team <br>
    *<b>pre:   </b> 
	*<b>post:  </b>
	*@return String, the id of the employee that will be removed
	*/
	public String getTeamName(){
		return teamName;
	}
	
	/**
	*The method adds an object of the class Player to the player array <br>
    *<b>pre: The creation of the player array </b> 
	*<b>post: The addition of an object to the player array </b>
	*@param name, the name of the player
	*@param id, the id of the player
	*@param salary, the salary of the player
	*@param shirtNumber, the number on the shirt of the player
	*@param goalsScored, the number of goals the player has scored 
	*@param averageRating, the average rating of the player
	*@param position, the position of the player 
	*/
	public void addPlayer(String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position){
		boolean created=false;
		for(int c=0;c<player.length&&!created;c++){
			if(player[c]==null){
				player[c]=new Player(name,id,salary,shirtNumber,goalsScored,averageRating,Position.valueOf(position.toUpperCase()));
				created=true;
			}
		}
	}
	
	/**
	*The method adds an object of the class Player to the player array <br>
    *<b>pre: The creation of the player array </b> 
	*<b>post: The addition of an object to the player array </b>
	*@param newPlayer, the name of the player
	*/
	public void addPlayer(Player newPlayer){
		boolean created=false;
		for(int c=0;c<player.length&&!created;c++){
			if(player[c]==null){
				player[c]= newPlayer;
				created=true;
			}
		}
	}
	
	/**
	*The method adds an object of the class Principal to the principal feild  <br>
    *<b>pre:  </b> 
	*<b>post: Changes the value of principal </b>
	*@param name, the name of the principal
	*@param id, the id of the principal
	*@param salary, the salary of the principal
	*@param yearsOfExperience, the years of experiencie of the principal
	*@param numberOfTeamsInCharge, the number of teams the principal has been in charge
	*@param championshipsWon, the number of champion ships the principal has won
	*/
	public void addPrincipalCoach(String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		principal = new Principal(name,id,salary,yearsOfExperience,numberOfTeamsInCharge,championshipsWon);
	}
	
	/**
	*The method adds an object of the class Principal to the principal feild  <br>
    *<b>pre:  </b> 
	*<b>post: Changes the value of principal </b>
	*@param principal, the name of the principal
	*/
	public void addPrincipalCoach(Principal principal){
		this.principal=principal;
	}
	
	public void addAssistanCoach(String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill){
		boolean created=false;
		for(int c=0;c<assistantCoach.length &&!created;c++){
			if(assistantCoach==null){
				created=true;
				assistantCoach[c]=new Assistant( name,  id,  salary,  yearsOfExperience, hasBeenPlayer, Skill.valueOf(skill.toUpperCase()));
			}
		}
	}
	
	/**
	*The method adds an object of the class Assistant to the assistantCoach array <br>
    *<b>pre: The creation of the assistantCoach array </b> 
	*<b>post: The addition of an object to the assistantCoach array </b>
	*@param assistant, the name of the assistantCoach
	*/
	public void addAssistanCoach(Assistant assistant){
		boolean created=false;
		for(int c=0;c<assistantCoach.length &&!created;c++){
			if(assistantCoach==null){
				created=true;
				assistantCoach[c]=assistant;
			}
		}
	}
	
	/**
	*The method returns a String with all the information of the team <br>
    *<b>pre: The creation of the assistantCoach array, and player array and principal field. And the method employeeToString()  </b> 
	*<b>post:  </b>
	*@return String, all the information of the employees of the team 
	*/
	public String teamToString(){
		String print= "Nombre del equipo: "+teamName+" \n";
		print+="Entrenador principal: \n";
		if(principal!=null)
			print+=principal.employeeToString()+"\n";
		print+="Entrenadores asistentes: \n";
		for(int c=0; c<assistantCoach.length && assistantCoach[c]!=null;c++)
			print+=assistantCoach[c].employeeToString()+"\n";
		print+="Jugadores: \n";
		for(int c=0; c<player.length&& player[c]!=null;c++)
			print+="("+(c+1)+") "+player[c].employeeToString()+"\n";
		return print;
		
	}
	
	/**
	*The method returns the an object from the array assistantCoach <br>
    *<b>pre: The creation of the assistantCoach array  </b> 
	*<b>post:  </b>
	*@param index, the index of the array
	*@return Coach, the assistant found in the index
	*/
	public Coach getAssistant(int index){
		return assistantCoach[index];
	}
	
	/**
	*The method returns the an object from the array player <br>
    *<b>pre: The creation of the player array  </b> 
	*<b>post:  </b>
	*@param index, the index of the array
	*@return Player, the player found in the index
	*/
	public Player getPlayer(int index){
		return player[index];
	}
	
	/**
	*The method returns the value of the field principal <br>
    *<b>pre: The creation of the field principal  </b> 
	*<b>post:  </b>
	*@return Principal, the principal coach of the team 
	*/
	public Principal getPrincipal(){
		return principal; 
	}
	
	/**
	*The method returns the of the constant MAXPLAYERS <br>
    *<b>pre:  </b> 
	*<b>post:  </b>
	*@return int, the maximun amount of player that can be created 
	*/
	public int getMAXPLAYERS(){
		return MAXPLAYERS;
	}
	
	/**
	*The method returns the of the constant MAXCOACHES <br>
    *<b>pre:  </b> 
	*<b>post:  </b>
	*@return int, the maximun amount of assistant that can be created 
	*/
	public int getMAXCOACHES(){
		return MAXCOACHES;
	}
	
}