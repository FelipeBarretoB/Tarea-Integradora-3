package model; 

public class Assistant extends Coach{
	private boolean hasBeenPlayer;
	private Skill skill;
	
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