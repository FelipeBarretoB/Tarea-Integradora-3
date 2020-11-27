package model; 

public abstract class Coach extends Employee{
	//The years of experience of the Coach
	private int yearsOfExperience;
	
	/**
	*The Overloaded constructor of the abstract class Coach
	*Uses the constructor of the super class 
	*@param name, the name of the employee
	*@param id, the id of the employee
	*@param salary, the salary of the employee
	*@param yearsOfExperience, the years of experience of the coach
	*/
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
	
	/**
	*The method returns the value of the field yearsOfExperience <br>
    *<b>pre: the creation of the yearsOfExperience field  </b> 
	*<b>post:  </b>
	*@return int, the yearsOfExperience of the coach
	*/
	public int getYearsOfExperience(){
		return yearsOfExperience;
	}

	
}
	