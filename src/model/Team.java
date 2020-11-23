package model;

public class Team{
	public static final int MAXPLAYERS=25;
	public static final int MAXCOACHES=4;
	private String teamName;
	private LineUp lineUp;
	private Principal principal;
	private Player[] player;
	private Coach[] assistantCoach;
	
	public Team(String teamName){
		this.teamName=teamName;
		lineUp=new LineUp();
		player=new Player[25];
		assistantCoach=new Coach[3];
	}
	
	public boolean hasPlayerSpace(){
		boolean hasSpace=false;
		for(int c=0;c<player.length&&!hasSpace;c++){
			if(player[c]==null)
				hasSpace=true;
		}
		return hasSpace;
	}
	
	public boolean hasAssistantSpace(){
		boolean hasSpace=false;
		for(int c=0;c<assistantCoach.length&&!hasSpace;c++){
			if(assistantCoach[c]==null)
				hasSpace=true;
		}
		return hasSpace;
	}
	
	public boolean hasPrincipalSpace(){
		boolean hasSpace=false;
			if(principal==null)
				hasSpace=true;
		return hasSpace;
	}

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
	
	
	public String getTeamName(){
		return teamName;
	}
	
	public void addPlayer(String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position){
		boolean created=false;
		for(int c=0;(c<player.length && player[c]==null)&&!created;c++){
			player[c]=new Player(name,id,salary,shirtNumber,goalsScored,averageRating,Position.valueOf(position.toUpperCase()));
			created=true;
		}
	}
	
	public void addPrincipalCoach(String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		principal = new Principal(name,id,salary,yearsOfExperience,numberOfTeamsInCharge,championshipsWon);
	}
	
	public void addAssistanCoach(String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill){
		boolean created=false;
		for(int c=0;(c<assistantCoach.length && player[c]==null)&&!created;c++){
			created=true;
			assistantCoach[c]=new Assistant( name,  id,  salary,  yearsOfExperience, hasBeenPlayer, Skill.valueOf(skill.toUpperCase()));
		}
	}
	
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
	
	public Coach getAssistant(int index){
		return assistantCoach[index];
	}
	
	public Player getPlayer(int index){
		return player[index];
	}
	
	public Principal getPrincipal(){
		return principal; 
	}
	
}