package model; 

public class Assistant extends Coach{
	//boolean that represents if the Assistant has or has not been a player 
	private boolean hasBeenPlayer;
	//The skill of the Assistant
	private Skill skill;
	
	/**
	*The Overloaded constructor of the class Assistant
	*Uses the constructor of the super class 
	*@param name, the name of the employee
	*@param id, the id of the employee
	*@param salary, the salary of the employee
	*@param yearsOfExperience, the years of experience of the coach
	*@param hasBeenPlayer, if the assistant has or has not been a player 
	*@param skill, the skill of the assistant 
	*/
	public Assistant(String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, Skill skill){
		super(name,id,salary,yearsOfExperience);
		this.hasBeenPlayer=hasBeenPlayer;
		this.skill=skill;
		
	}
	
	@Override
	public String employeeToString(){
		return super.employeeToString()+
		"ha sido jugador: "+hasBeenPlayer+"\n"+
		"Experiencia en: "+skill.name()+"\n";
	}
	
}