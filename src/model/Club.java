package model;

public class Club implements ClubMethods{
	

	private String name;
	private int id;
	private String creationDate;
	private Team[] team;
	private Player[][] dressingRoom1;
	private Player[][] dressingRoom2;
	private Player[][] dressingRoom3;
	private Player[][] dressingRoom4;
	private Coach[][] office;
	private Coach[][] office2;

	
	public Club(String name, int id, String creationDate, String nameA, String nameB){
		this.name=name;
		this.id=id;
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
	
	
	public void fireEmployee(int index,String id){
		team[index].fireEmployee(id);
	}
	
	public void biosecurity(){
		int index=0;
		for(int c=0;c<dressingRoom1.length && c%2==0;c++){
			for(int i=0;c<dressingRoom1[c].length && c%2==0;i++){
				dressingRoom1[c][i]=team[0].getPlayer(index);
				index++;
			}
		}
		for(int c=0;c<dressingRoom2.length && c%2==0;c++){
			for(int i=0;c<dressingRoom2[c].length && c%2==0;i++){
				dressingRoom2[c][i]=team[0].getPlayer(index);
				index++;
			}
		}
		index=0;
		office[0][0]=team[0].getPrincipal();
		for(int c=1;c<office.length && c%2==0;c++){
			for(int i=1;c<office[c].length && c%2==0;i++){
				office[c][i]=team[0].getAssistant(index);
				index++;
			}
		}
		
		index=0;
		for(int c=0;c<dressingRoom3.length && c%2==0;c++){
			for(int i=0;c<dressingRoom3[c].length && c%2==0;i++){
				dressingRoom3[c][i]=team[1].getPlayer(index);
				index++;
			}
		}
		for(int c=0;c<dressingRoom4.length && c%2==0;c++){
			for(int i=0;c<dressingRoom4[c].length && c%2==0;i++){
				dressingRoom4[c][i]=team[1].getPlayer(index);
				index++;
			}
		}
		index=0;
		office2[0][0]=team[1].getPrincipal();
		for(int c=1;c<office2.length && c%2==0;c++){
			for(int i=1;c<office2[c].length && c%2==0;i++){
				office2[c][i]=team[1].getAssistant(index);
				index++;
			}
		}
		
	}          
	
	
	public boolean checkId(int index,String id){
		return team[index].checkId(id);
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
	
	public void addLineUp(Team team){}
	

	
	
	public String showInfo(){
		String print="";
		showEmployee();
		print+="\n Vestieres \n";
		
		
		
		return print;
	}
	
	
}