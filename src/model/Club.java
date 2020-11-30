package model;
import java.util.ArrayList;
public class Club implements ClubMethods{
	//The ArryList if the club's employees
	private ArrayList <Employee> clubEmployees; 
	//The name of the club
	private String name;
	//The NIT code of the club
	private int nit;
	//The date of the creation of the club
	private String creationDate;
	//The array of the teams in the club
	private Team[] team;
	//The first dressing room of the first team
	private Player[][] dressingRoom1;
	//The first dressing room of the second team 
	private Player[][] dressingRoom2;
	//The offices of the club
	private Coach[][] office;

	/**
	*The Overloaded constructor of the class Club
	*Gives name a value
	*Gives nit a value
	*Gives creationDate a value 
	*Gives two teams to the team array
	*Initializes the clubEmployees ArrayList
	*Initializes all 2d arrays
	*@param name, the name of the club
	*@param nit, the NIT code for the club
	*@param creationDate, the creation date of the club
	*@param nameA, name of the team in Team[0]
	*@param nameB, name of the team in Team[1]
	*/
	public Club(String name, int nit, String creationDate, String nameA, String nameB){
		this.name=name;
		this.nit=nit;
		this.creationDate=creationDate;
		team= new Team[] {new Team(nameA),new Team(nameB)};
		dressingRoom1=new Player[7][7];
		dressingRoom2=new Player[7][6];
		office=new Coach[6][6];
		clubEmployees=new ArrayList <Employee> ();
		
	}
	
	@Override
	public String printTeamNames(){
		return "(1) "+team[0].getTeamName()+" \n"+
		"(2) "+team[1].getTeamName()+"\n";
	}

	
	@Override
	public void fireEmployee(String id){
		team[0].fireEmployee(id);
		team[1].fireEmployee(id);
	}
	
	
	@Override
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
		
	
		index=0;
		if(team[0].getPrincipal()!=null)
			office[0][0]=team[0].getPrincipal();
		else
			office[0][0]=null;
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
		for(int c=0;c<dressingRoom2.length && index<team[1].getMAXPLAYERS() ;c++){
			for(int i=0;i<dressingRoom2[c].length && index<team[1].getMAXPLAYERS();i++){
				if(team[1].getPlayer(index)==null && (c%2==0 && i%2==0)){
					dressingRoom2[c][i]=null;
					index++;
				}else if(c%2==0 && i%2==0){
					dressingRoom2[c][i]=team[1].getPlayer(index);
					index++;
				}
			}
		}
		
		index=0;
		if(team[1].getPrincipal()!=null)
			office[2][2]=team[1].getPrincipal();
		else
			office[2][2]=null;
		for(int c=2;c<office.length && index<team[1].getMAXCOACHES() ;c++){
			for(int i=2;i<office[c].length && index<team[1].getMAXCOACHES() ;i++){
				if(team[1].getAssistant(index)==null&& (c%2==0 && i%2==0)){
					office[c][i]=null;
					index++;
				}else if(c%2==0 && i%2==0){
				office[c][i]=team[1].getAssistant(index);
				index++;
				}
			}
		}
		
	}          
	
	@Override
	public boolean checkId(String id){
		boolean found= false;

		for(int c=0;(c<clubEmployees.size()); c++){
			if(clubEmployees!=null && clubEmployees.get(c).getId().equals(id))
				 found=true; 	
		}
		return found;
			
	}
	
	@Override
	public void hirePlayer(int index, String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, String position){
		team[index].addPlayer(name,id,salary,shirtNumber,goalsScored,averageRating,position);
		clubEmployees.add(new Player(name,id,salary,shirtNumber,goalsScored,averageRating,Position.valueOf(position.toUpperCase())));
	}
	
	@Override
	public void hirePrincipalCoach(int index, String name, String id, double salary, int yearsOfExperience,int numberOfTeamsInCharge,int championshipsWon){
		team[index].addPrincipalCoach( name,  id,  salary,  yearsOfExperience, numberOfTeamsInCharge, championshipsWon);	
		clubEmployees.add(new Principal( name,  id,  salary,  yearsOfExperience, numberOfTeamsInCharge, championshipsWon));		
	}
	@Override
	public void hireAssistantCoach(int index, String name, String id, double salary, int yearsOfExperience,boolean hasBeenPlayer, String skill){
		team[index].addAssistanCoach( name,  id,  salary,  yearsOfExperience, hasBeenPlayer,  skill);
		clubEmployees.add(new Assistant(name,  id,  salary,  yearsOfExperience, hasBeenPlayer,Skill.valueOf(skill.toUpperCase())));
	}
	
	@Override
	public String showEmployee(){
		String print="";
		print+=team[0].teamToString()+"\n";
		
		
		print+=team[1].teamToString()+"\n";
		return print;
	}
	
	@Override
	public String showEmployee(int index){
		String print="";
		print+=team[index].teamToString()+"\n";
		return print;
	}

	@Override 
	public boolean hasPlayerSpace(int index){
		return team[index].hasPlayerSpace();
	}
	
	@Override 
	public boolean hasCoachSpace(int index){
		return team[index].hasAssistantSpace();		
	}
	
	@Override 
	public boolean hasPrincipalSpace(int index){
		return team[index].hasPrincipalSpace();
	}
	
	@Override 
	public void findEmployee(String id, int index){
		team[index].fireEmployee(id);
	}
	
	@Override 
	public String findEmployee(String id){
		String print="";
		if(team[0].findEmployee(id)!=null)
			print=team[0].findEmployee(id).employeeToString();
		else if(team[1].findEmployee(id)!=null)
			print=team[1].findEmployee(id).employeeToString();
		return print;
	
	}
	
	@Override 
	public void fireClubEmployee(String id){
		boolean fired=false;
		for(int c=0;(c<clubEmployees.size()&&!fired); c++){
			if(clubEmployees!=null && clubEmployees.get(c).getId().equals(id)){
				clubEmployees.get(c).inactive(); 
				team[0].fireEmployee(id);
				team[1].fireEmployee(id);
				fired=true;
			}
		}
		
	}
	
	
	@Override 
	public String showClubEmployees(){
		String print="";
		print+="Empleados del club: \n";
		for(int c=0;(c<clubEmployees.size() && !clubEmployees.isEmpty()); c++){
			if(clubEmployees!=null)
				print+="("+(c+1)+") "+clubEmployees.get(c).employeeToString(); 
		}
		return print;
	}
	
	@Override
	public boolean employeeHasTeam(String id){
		boolean hasTeam=false;
		if(findEmployee(id).equals("")){
			hasTeam=true;
		}
		return hasTeam;
	}
	
	@Override 
	public void addClubEmployeeToTeam(int index, String id){
		boolean found=false;
		for(int c=0;(c<clubEmployees.size()&&!found); c++){
			if(clubEmployees!=null && clubEmployees.get(c).getId().equals(id)){
				if(clubEmployees.get(c) instanceof Player && hasPlayerSpace(index) ){
					team[index].addPlayer((Player)clubEmployees.get(c)); 
					found=true;
				}else if(clubEmployees.get(c) instanceof Assistant && hasCoachSpace(index)){
					team[index].addAssistanCoach((Assistant)clubEmployees.get(c));
					found=true;
				}else if(clubEmployees.get(c) instanceof Principal && hasPrincipalSpace(index)){
					team[index].addPrincipalCoach((Principal)clubEmployees.get(c));
					found=true;
				}
			}
		}
	}
	
	@Override 
	public boolean activeEmployee(String id){
		boolean active=false;
		boolean found=false; 
		for(int c=0;(c<clubEmployees.size()&&!found); c++){
			if(clubEmployees!=null && clubEmployees.get(c).getId().equals(id)){
				active=clubEmployees.get(c).getActive();
				found=true;
			}
		}
		return active; 
	}
	
	@Override
	public boolean addsTen(int index, String lineUp){
		return team[index].add10(lineUp);
	}
	
	@Override
	public void addLineUp(int index, String lineUp, String date, String tactics){
		team[index].addLineUp( lineUp,  date,  tactics);
	}
	
	@Override
	public String showLineUp(int index){
		return team[index].printLineUp();
		
	}
	
	
	@Override
	public String showInfo(){
		String print="";
		print+="Nombre del club: "+name+"\n"+
		"NIT"+nit+"\n"+
		"Fecha de fundacion: "+creationDate+"\n";
		print+=showClubEmployees()+"\n";
		print+=showEmployee()+"\n";
		print+="\n Vestieres del equipo A \n";
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
		print+="\n Alineaciones del equipo A \n"+
		showLineUp(0)+"\n";
		
		
		print+="\n Officina del club \n";
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
		
		print+="\n Vestieres del equipo B \n";
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
		print+="\n Alineaciones del equipo B \n"+
		showLineUp(1)+"\n";
		
		return print;
	}
	
	
}