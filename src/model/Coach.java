package model; 

public abstract class Coach extends Employee{
	private int yearsOfExperience;
	
	public Coach(String name, String id, double salary, int yearsOfExperience){
		super(name,id,salary);
		this.yearsOfExperience=yearsOfExperience;
	}
	
	@Override
	public String employeeToString(){
		String print=super.employeeToString()+
		"Años de experiencia: "+yearsOfExperience+"\n";
		return print;
	}
	
	public int getYearsOfExperience(){
		return yearsOfExperience;
	}

	
}
	