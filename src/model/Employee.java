package model;

public abstract class Employee{
	//The name of the employee
	private String name;
	//The id of the employee 
	private String id;
	//The salary of the employee
	private double salary;
	//The status of the employee
	private boolean active;
	
	/**
	*The method returns the value of the field id <br>
    *<b>pre: the creation of the id field  </b> 
	*<b>post:  </b>
	*@return String, the id of the employee
	*/
	public String getId(){
		return id;
	}
	
	/**
	*The method returns the value of the field name <br>
    *<b>pre: the creation of the name field  </b> 
	*<b>post:  </b>
	*@return String, the name of the employee
	*/
	public String getName(){
		return name;
	}
	
	/**
	*The method returns the value of the field salary <br>
    *<b>pre: the creation of the salary field  </b> 
	*<b>post:  </b>
	*@return double, the salary of the employee
	*/
	public double getSalary(){
		return salary;
	}
	
	/**
	*The Overloaded constructor of the abstract class Employee
	*Gives name a value
	*Gives id a value
	*Gives salary a value
	*@param name, the name of the employee
	*@param id, the id of the employee
	*@param salary, the salary of the employee
	*/
	public Employee(String name, String id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		active=true;
		
	}
	
	public void inactive(){
		active=false;
	}
	
	public boolean getActive(){
		return active;
	}
	
	/**
	*The method returns the values of the field in the class in a String <br>
    *<b>pre: Te creation of the fields of the class  </b> 
	*<b>post:  </b>
	*@return String, returns a String with all the information of the class 
	*/
	public String employeeToString(){
		return "Nombre: "+name+" \n"+
		"ID: "+id+"\n"+
		"Salario: "+salary+"\n"+
		"Esta activo: "+active+"\n";
	}
	
}