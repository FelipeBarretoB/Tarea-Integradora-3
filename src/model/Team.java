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
	
	public String getTeamName(){
		return teamName;
	}
	
	public void addPlayer(String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position){
		for(int c=0;c<player.length && player[c]==null;c++){
			player[c]=new Player(name,id,salary,shirtNumber,goalsScored,averageRating,Position.valueOf(position.toUpperCase()));
		}
	}
	
	public void addPrincipalCoach(String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		principal = new Principal(name,id,salary,yearsOfExperience,numberOfTeamsInCharge,championshipsWon);
	}
	
	public void addAssistanCoach(String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill){
		for(int c=0;c<assistantCoach.length && player[c]==null;c++){
			assistantCoach[c]=new Assistant( name,  id,  salary,  yearsOfExperience, hasBeenPlayer, Skill.valueOf(skill.toUpperCase()));
		}
	}
	
}