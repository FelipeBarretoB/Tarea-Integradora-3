package model;

public class LineUp{
	//The date of the line up
	private String date;
	//The matrix for the formation
	private int[][] formation;
	//The tactic of the line up
	private Tactics tactics;
	//The form of the line up
	private String form;
	
	/**
	*The Overloaded constructor of the class LineUp
	*Gives date a value
	*Gives date a tactics
	*Initializes the formation 2d arrays
	*@param date, the date of the line up
	*@param tactics, the tactic of the line up
	*/
	public LineUp(String date, String tactics){
		this.date=date;
		this.tactics=Tactics.valueOf(tactics.toUpperCase());
		formation=new int[10][7];
		form="";
	}
	
	/**
	*The method gives the field form a new value <br>
    *<b>pre: The existance of the field form</b> 
	*<b>post: form has a new value </b>
	*@param form, the form of the line up the user has given
	*/
	public void setForm(String form){
		this.form=form;
	}

	/**
	*The method gives some spaces of the formation 2d array the value of 1, to indicate there is a player there <br>
    *<b>pre: The existance of method fill line</b> 
	*<b>post: gives new values to some parts of the formation 2d array </b>
	*/
	public void fillFormation(){
		int index=0; 
		String[] num = form.split("-"); 
		int lines= 10/num.length;
		for(int c=9;c>=0 && index <num.length; c-=lines){
			fillLine( num, index, c );
			index++;
		}
		
	}
	
	/**
	*The method fills a row of the formation 2d array <br>
    *<b>pre: the existance of the formation 2d array</b> 
	*<b>post: gives new values to a row of the formation 2d array </b>
	*@param num, the result of the method .split("-") of the class String on the String form 
	*@param index, the index of the array num[] that is going to be used 
	*@param row, the row that is going to be filled
	*/
	public void fillLine(String[] num,int index,  int row ){
		int lines = 7/Integer.parseInt(num[index]);
		int i=0; 
		int y=0;
		int added=0;
		if(Integer.parseInt(num[index])%2==0){
			i=4; 
			y=2;
			do{
				formation[row][y]=1;
				formation[row][i]=1;
				i+=lines;
				y-=lines;
				added+=2;
				
				
			}while(added<Integer.parseInt(num[index]));
			
		}else{
			i=3; 
			y=3;
			added=1;
			do{
				formation[row][i]=1;
				formation[row][y]=1;
				i+=lines;
				y-=lines;
				added+=2;
			}while(added<=Integer.parseInt(num[index]));
		}
	}
	
	/**
	*The method returns a String with all the information of the class <br>
    *<b>pre: The creation of the formation 2d array</b> 
	*<b>post:  </b>
	*@return String, a String with all the information of the class 
	*/
	public String printMatrix(){
		String print="";
		print="Tactica: "+tactics.name()+"\n";
		print+="Fecha: "+ date+"\n";
		print+="Formación: "+form+"\n";
		for(int c=0; c<formation.length;c++){
			for(int i=0; i<formation[c].length;i++){
				print+=formation[c][i]+"   ";
			}
			print+="\n";
		}
		return print; 
	}
	
	
	
}