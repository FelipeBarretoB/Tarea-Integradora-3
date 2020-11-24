package model;

public class Club implements ClubMethods{
	

	private String name;
	private int nit;
	private String creationDate;
	private Team[] team;
	private Player[][] dressingRoom1;
	private Player[][] dressingRoom2;
	private Player[][] dressingRoom3;
	private Player[][] dressingRoom4;
	private Coach[][] office;
	private Coach[][] office2;

	
	public Club(String name, int nit, String creationDate, String nameA, String nameB){
		this.name=name;
		this.nit=nit;
		this.creationDate=creationDate;
		team= new Team[] {new Team(nameA),new Team(nameB)};
		dressingRoom1=new Player[7][7];
		dressingRoom2=new Player[7][6];
		dressingRoom3=new Player[7][7];
		dressingRoom4=new Player[7][6];
		office=new Coach[6][6];
		office2=new Coach[6][6];
		
	}
	
	public String printTeamNames(){
		return "(1) "+team[0].getTeamName()+" \n"+
		"(2) "+team[1].getTeamName()+"\n";
	}

	
	
	public void fireEmployee(String id){
		team[0].fireEmployee(id);
		team[1].fireEmployee(id);
	}
	
	
	
	public void biosecurity(){
		
		int index=0;
		for(int c=0;c<dressingRoom1.length && index<team[0].getMAXPLAYERS()  ;c++){
			for(int i=0;i<dressingRoom1[c].length && index<team[0].getMAXPLAYERS() ;i++){
				if(team[0].getPlayer(index)==null && (c%2==0 && i%2==0) ){
					dressingRoom1[c][i]=null;
					index++;
				}else if(c%2==0 && i%2==0){
					dressingRoom1[c][i]=team[0].getPlayer(index);
					index++;
				}
			}
		}
		
		for(int c=0;c<dressingRoom2.length && index<team[0].getMAXPLAYERS() ;c++){
			for(int i=0;i<dressingRoom2[c].length && index<team[0].getMAXPLAYERS() ;i++){
				if(team[0].getPlayer(index)==null && (c%2==0 && i%2==0)){
					dressingRoom2[c][i]=null;
					index++;	
				}else if(c%2==0 && i%2==0){
					dressingRoom2[c][i]=team[0].getPlayer(index);
					index++;
				}
			}
		}
		index=0;
		if(team[0].getPrincipal()!=null)
			office[0][0]=team[0].getPrincipal();
		for(int c=1;c<office.length && index<team[0].getMAXCOACHES() ;c++){
			for(int i=1;i<office[c].length  && index<team[0].getMAXCOACHES() ;i++){
				if(team[0].getAssistant(index)==null && (c%2==0 && i%2==0)){
					office[c][i]=null;
					index++;
				}else if(c%2==0 && i%2==0){
					office[c][i]=team[0].getAssistant(index);
					index++;
				}
			}
		}
		
		index=0;
		for(int c=0;c<dressingRoom3.length && index<team[1].getMAXPLAYERS() ;c++){
			for(int i=0;i<dressingRoom3[c].length && index<team[1].getMAXPLAYERS();i++){
				if(team[1].getPlayer(index)==null && (c%2==0 && i%2==0)){
					dressingRoom3[c][i]=null;
					index++;
				}else if(c%2==0 && i%2==0){
					dressingRoom3[c][i]=team[1].getPlayer(index);
					index++;
				}
			}
		}
		for(int c=0;c<dressingRoom4.length && index<team[1].getMAXPLAYERS() ;c++){
			for(int i=0;i<dressingRoom4[c].length && index<team[1].getMAXPLAYERS() ;i++){
				if(team[1].getPlayer(index)==null && (c%2==0 && i%2==0)){
					dressingRoom4[c][i]=null;
					index++;
			}else if(c%2==0 && i%2==0){
				dressingRoom4[c][i]=team[1].getPlayer(index);
				index++;
				}
			}
		}
		index=0;
		if(team[1].getPrincipal()!=null)
			office2[0][0]=team[1].getPrincipal();
		for(int c=1;c<office2.length && index<team[1].getMAXCOACHES() ;c++){
			for(int i=1;i<office2[c].length && index<team[1].getMAXCOACHES() ;i++){
				if(team[1].getAssistant(index)==null&& (c%2==0 && i%2==0)){
					dressingRoom4[c][i]=null;
					index++;
				}else if(c%2==0 && i%2==0){
				office2[c][i]=team[1].getAssistant(index);
				index++;
				}
			}
		}
		
	}          
	
	
	public boolean checkId(String id){
		return team[0].checkId(id) || team[1].checkId(id);
	}
	
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position){
		team[index].addPlayer(name,id,salary,shirtNumber,goalsScored,averageRating,position);
	}
	
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		team[index].addPrincipalCoach( name,  id,  salary,  yearsOfExperience, numberOfTeamsInCharge, championshipsWon);		
	}
	
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill){
		team[index].addAssistanCoach( name,  id,  salary,  yearsOfExperience, hasBeenPlayer,  skill);
	}
	
	public String showEmployee(){
		String print="";
		print+=team[0].teamToString()+"\n";
		
		
		print+=team[1].teamToString()+"\n";
		return print;
	}
	
	public String showEmployee(int index){
		String print="";
		print+=team[index].teamToString()+"\n";
		return print;
	}

	
	public boolean hasPlayerSpace(int index){
		return team[index].hasPlayerSpace();
		
		
	}
	
	public boolean hasCoachSpace(int index){
		return team[index].hasAssistantSpace();		
	}
	
	public boolean hasPrincipalSpace(int index){
		return team[index].hasPrincipalSpace();
	}
	
	public void findEmployee(String id, int index){
		team[index].fireEmployee(id);
	}
	
	public String findEmployee(String id){
		String print="";
		if(team[0].findEmployee(id)!=null)
			print=team[0].findEmployee(id).employeeToString();
		else
			print=team[1].findEmployee(id).employeeToString();
		return print;
	
	}
	
	public void addLineUp(Team team){}
	

	
	
	public String showInfo(){
		String print="";
		print+="Nombre del club: "+name+"\n"+
		"NIT"+nit+"\n"+
		"Fecha de fundacion: "+creationDate+"\n";
		print+=showEmployee()+"\n";
		print+="\n Vestieres del equipo 1 \n";
		for(int c=0;c<dressingRoom1.length;c++){
			print+="\n";
			for(int i=0;i<dressingRoom1[c].length;i++){
				if(dressingRoom1[c][i]==null){
					print+="vacio   ";
				}else{
					print+=dressingRoom1[c][i].getName()+"   ";
				}
			}
		}
		print+="\n Segundo vestier del equipo 1 \n";
		for(int c=0;c<dressingRoom2.length;c++){
			print+="\n";
			for(int i=0;i<dressingRoom2[c].length;i++){
				if(dressingRoom2[c][i]==null){
					print+="vacio   ";
				}else{
					print+=dressingRoom2[c][i].getName()+"   ";
				}
			}
		}
		print+="\n Officina de equipo 1 \n";
		for(int c=0;c<office.length;c++){
			print+="\n";
			for(int i=0;i<office[c].length;i++){
				if(office[0][0]==null)
					print+="vacio   ";
				else if(c==0 && i==0)
					print+=office[0][0].getName()+"   ";
				else if(office[c][i]==null){
					print+="vacio   ";
				}else{
					print+=office[c][i].getName()+"   ";
				}
			}
		}
		
		print+="\n Vestieres del equipo 2 \n";
		for(int c=0;c<dressingRoom3.length;c++){
			print+="\n";
			for(int i=0;i<dressingRoom3[c].length;i++){
				if(dressingRoom3[c][i]==null){
					print+="vacio   ";
				}else{
					print+=dressingRoom3[c][i].getName()+"   ";
				}
			}
		}
		print+="\n Segundo vestier del equipo 2 \n";
		for(int c=0;c<dressingRoom4.length;c++){
			print+="\n";
			for(int i=0;i<dressingRoom4[c].length;i++){
				if(dressingRoom4[c][i]==null){
					print+="vacio   ";
				}else{
					print+=dressingRoom4[c][i].getName()+"   ";
				}
			}
		}
		print+="\n Officina de equipo 2 \n";
		
		for(int c=0;c<office2.length;c++){
			print+="\n";
			for(int i=0;i<office2[c].length;i++){
				if(office2[0][0]==null)
					print+="vacio   ";
				else if(c==0 && i==0)
					print+=office2[0][0].getName()+"   ";
				else if(office2[c][i]==null){
					print+="vacio   ";
				}else{
					print+=office2[c][i].getName()+"   ";
				}
			}
		}
		
		
		
		return print;
	}
	
	
}