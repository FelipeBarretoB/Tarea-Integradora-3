package ui;
import java.util.Scanner;
import model.Club;
public class Main{
	//The Scanner that will be used for the user's input 
	private Scanner sc;
	//The club that is going to be consulted 
	private Club club;
	
	/**
	*default constructor of the class Main
	*the initiation of the Scanner and Club object
	*/
	public Main(){
		sc= new Scanner(System.in);
		club=new Club("SuperClub",12341421,"20/03/2000","Equipo A","Equipo B");
	}
	
	public static void main(String [] args){
		Main ui=new Main();
		int option=0;
		
		do{
			option= ui.showMenu();
			ui.executeOperation(option);
			
		}while (option!=0);
		
		
	}
	
	/**
	*The method prints a menu<br>
    *<b>pre:  </b> 
	*<b>post: </b>
	*@return int, the option the user selected 
	*/
	public int showMenu() {
		
		int option=0;
		
		

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para contratar un empleado \n" +
				"(2) Para mostrar los equipos \n"+
				"(3) Para para despedir un empleado de un equipo\n"+
				"(4) Para aplicar protocolos de bioseguridad \n" +
				"(5) Para mostrar toda la información del club \n" + 
				"(6) Para encontrar un empleado \n" +  
				"(7) Para mostrar solo un equipo \n" +  
				"(8) Para despedir a un empleado del club \n" +  
				"(9) Para mostrar los empleados del club \n" +  
				"(10) Para agregar un empleado del club a un equipo \n" +  
				"(11) Para añadir una alineacion \n" +  
				"(12) Para mostrar las alineaciones de un equipo \n" +  
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	/**
	*The method receives an int and uses it in a switch<br>
    *<b>pre: the creation of the methods: showHireMenu(), showEmployee(), fireEmployeeInfo(), biosecurity(), showInfo(), findEmployeeInfo(), showClubEmployees(), addClubEmployeeToTeamInfo(), addLineUpInfo(), and showLineUpInfo() </b> 
	*<b>post: </b>
	*@param operation, the option the user selected 
	*/
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			System.out.println("\n");
			showHireMenu();
			System.out.println("\n");
			break;
		case 2:
			System.out.println("\n");
			System.out.println(club.showEmployee());
			System.out.println("\n");
			break;
	
		case 3:
			System.out.println("\n");
			fireEmployeeInfo();
			System.out.println("\n");
			break;

		case 4:
			System.out.println("\n");
			club.biosecurity();
			System.out.println("\n");
			break;
		case 5:
			System.out.println("\n");
			System.out.println(club.showInfo());
			System.out.println("\n");
			break;
			
		case 6:
			System.out.println("\n");
			findEmployeeInfo();
			System.out.println("\n");
			break;
		case 7:
			System.out.println("\n");
			showTeamInfo();
			System.out.println("\n");
			break;
		case 8:
			System.out.println("\n");
			fireClubEmployeeInfo();
			System.out.println("\n");
			break;
		case 9:
			System.out.println("\n");
			System.out.println(club.showClubEmployees());
			System.out.println("\n");
			break;
		case 10:
			System.out.println("\n");
			addClubEmployeeToTeamInfo();
			System.out.println("\n");
			break;
		case 11:
			System.out.println("\n");
			addLineUpInfo();
			System.out.println("\n");
			break;
		case 12:
			System.out.println("\n");
			showLineUpInfo();
			System.out.println("\n");
			break;
		default:
			System.out.println("Error, opción no válida");
		
		}
	}
	
	/**
	*The method prints a menu<br>
    *<b>pre: The creation of the methods hirePlayerInfo(), hirePrincipalCoachInfo(), hireAssistantInfo() </b> 
	*<b>post: </b>
	*/
	public void showHireMenu(){
		int operation=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para contratar un jugador \n" +
				"(2) Para contratar un entrenador principal \n"+
				"(3) Para contratar un entrenador asistente \n"+ 
				"(0) Para salir"
				);
		operation= sc.nextInt();
		sc.nextLine();
		
		switch(operation) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("\n");
			hirePlayerInfo();
			System.out.println("\n");
			break;
		case 2:
			System.out.println("\n");
			hirePrincipalCoachInfo();
			System.out.println("\n");
			break;
	
		case 3:
			System.out.println("\n");
			hireAssistantInfo();
			System.out.println("\n");
			break;

		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}
	
	/**
	*The method aks the user for the parameters for the method hirePlayer from the class Club<br>
    *<b>pre:The creation of the methods checkId(), hasPlayerSpace() and hirePlayer()  </b> 
	*<b>post: </b>
	*/
	public void hirePlayerInfo(){
		System.out.println("A cual equipo le quieres añadir un jugador?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			if(club.hasPlayerSpace(index-1)){
				System.out.println("Cual es el nombre del jugador?");
				String name= sc.nextLine();
				System.out.println("Cual es el id del jugador?");
				String id=sc.nextLine();
				if(!club.checkId(id)){
					System.out.println("cual es el salario del jugador?");
					double salary=sc.nextDouble();
					sc.nextLine();
					System.out.println("Cual es el numero de la camisata del usuario?");
					int shirtNumber=sc.nextInt();
					sc.nextLine();
					System.out.println("Cuantos goles a anotado el jugador?");
					int goalsScored=sc.nextInt();
					sc.nextLine();
					System.out.println("Cual es el puntaje promedio del jugador?");
					double averageRating=sc.nextDouble();
					sc.nextLine();
					System.out.println("Cual es la posicion del jugador?");
					String position=sc.nextLine();
					club.hirePlayer( index-1,  name,  id,  salary, shirtNumber,  goalsScored,  averageRating,  position);	
				}else
					System.out.println("Ya hay un empleado con esta id"); 
			}else
				System.out.println("No hay espacio para más jugadores"); 
		}else
			System.out.println("Este equipo no es valido"); 
		
	}
		
		
	/**
	*The method aks the user for the parameters for the method hirePrincipalCoach from the class Club<br>
    *<b>pre:The creation of the methods checkId(), printTeamNames(), hasPlayerSpace() and hirePrincipalCoach()  </b> 
	*<b>post: </b>
	*/	
	public void hirePrincipalCoachInfo(){
		System.out.println("A cual equipo le quieres añadir un entrenador principal?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			if(club.hasPrincipalSpace(index-1)){
				System.out.println("Cual es el nombre del entrenador principal?");
				String name= sc.nextLine();
				System.out.println("Cual es el id del entrenador principal?");
				String id=sc.nextLine();
				if(!club.checkId(id)){
					System.out.println("cual es el salario del entrenador principal?");
					double salary=sc.nextDouble();
					sc.nextLine();
					System.out.println("Cuantos años de experiencia tiene el entrenador?");
					int yearsOfExperience=sc.nextInt();
					sc.nextLine();
					System.out.println("De cuantos equipos esta a cargo?");
					int numberOfTeamsInCharge=sc.nextInt();
					sc.nextLine();
					System.out.println("Cuantos campeonatos a ganado?");
					int championshipsWon=sc.nextInt();
					sc.nextLine();
					club.hirePrincipalCoach( index-1,  name,  id,  salary,  yearsOfExperience, numberOfTeamsInCharge, championshipsWon);
				}else
					System.out.println("Ya hay un empleado con esta id"); 
			}else
				System.out.println("Ya hay entrenador principal"); 
		}else
			System.out.println("Este equipo no es valido"); 
	}
		
	/**
	*The method aks the user for the parameters for the method hireAssistantCoach from the class Club<br>
    *<b>pre:The creation of the methods checkId(), printTeamNames(), hasPlayerSpace() and hireAssistantCoach()  </b> 
	*<b>post: </b>
	*/		
	public void hireAssistantInfo(){
		System.out.println("A cual equipo le quieres añadir un entrenador asistente?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			if(club.hasCoachSpace(index-1)){
				System.out.println("Cual es el nombre del entrenador asistente?");
				String name= sc.nextLine();
				System.out.println("Cual es el id del entrenador asistente?");
				String id=sc.nextLine();
				if(!club.checkId(id)){
					System.out.println("cual es el salario del entrenador asistente?");
					double salary=sc.nextDouble();
					sc.nextLine();
					System.out.println("Cuantos años de experiencia tiene el asistente?");
					int yearsOfExperience=sc.nextInt();
					sc.nextLine();
					System.out.println("A sido un jugador?");
					boolean hasBeenPlayer=sc.nextBoolean();
					sc.nextLine();
					System.out.println("Que experiencia tiene el asistente?");
					String skill=sc.nextLine();
					club.hireAssistantCoach( index-1,  name, id ,  salary,  yearsOfExperience, hasBeenPlayer,  skill);
				}else
					System.out.println("Ya hay un empleado con esta id"); 
			}else
				System.out.println("No hay más espacio para asistentes"); 
		}else
			System.out.println("Este equipo no es valido"); 
		
	}
	
	/**
	*The method aks the user for the parameters for the method fireEmployee from the class Club<br>
    *<b>pre:The creation of the methods checkId() and fireEmployee()  </b> 
	*<b>post: </b>
	*/		
	public void fireEmployeeInfo(){
		System.out.println("Cual es la id del empleado?");
		String id=sc.nextLine();
		if(club.checkId(id)){
			club.fireEmployee(id);
		}else 
			System.out.println("No existe ningun empleado con esta id");
	}
	
	/**
	*The method aks the user for the parameters for the method findEmployee from the class Club<br>
    *<b>pre:The creation of the methods checkId() and findEmployee()  </b> 
	*<b>post: </b>
	*/	
	public void findEmployeeInfo(){
		System.out.println("Cual es la id del empleado?");
		String id=sc.nextLine();
		if(club.checkId(id)){
			System.out.println(club.findEmployee(id));
		}else 
			System.out.println("No existe ningun empleado con esta id");
		
	}
	
	/**
	*The method aks the user for the parameters for the method showEmployee from the class Club<br>
    *<b>pre:The creation of the methods printTeamNames() and showEmployee()  </b> 
	*<b>post: </b>
	*/	
	public void showTeamInfo(){
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1)
			System.out.println(club.showEmployee( index-1));
		else
			System.out.println("Este equipo no es valido"); 
	}
	
	/**
	*The method aks the user for the parameters for the method fireClubEmployee from the class Club<br>
    *<b>pre:The creation of the methods checkId() and fireClubEmployee()  </b> 
	*<b>post: </b>
	*/	
	public void fireClubEmployeeInfo(){
		System.out.println("Cual es la id del empleado?");
		String id=sc.nextLine();
		if(club.checkId(id)){
			club.fireClubEmployee(id);
		}else 
			System.out.println("No existe ningun empleado con esta id");
	}
	
	/**
	*The method aks the user for the parameters for the method addClubEmployeeToTeam from the class Club<br>
    *<b>pre:The creation of the methods printTeamNames(), activeEmployee(), employeeHasTeam(),checkId() and addClubEmployeeToTeam()  </b> 
	*<b>post: </b>
	*/	
	public void addClubEmployeeToTeamInfo(){
		System.out.println("A que equipo quiere añadir el empleado?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			System.out.println("Cual es la id del empleado");
			String id=sc.nextLine();
			if(club.checkId(id)){
				if(club.activeEmployee( id)){
					if(club.employeeHasTeam(id))
						club.addClubEmployeeToTeam(index-1, id);
					else
						System.out.println("El empleado ya tiene equipo"); 
				}else 
					System.out.println("Este empleado ya no esta activo");
			}else
				System.out.println("No existe ningun empleado con esta id");
		}else
			System.out.println("Este equipo no es valido");
	}
	
	/**
	*The method aks the user for the parameters for the method addLineUp from the class Club<br>
    *<b>pre:The creation of the methods addsTen(), printTeamNames and addLineUp()  </b> 
	*<b>post: </b>
	*/	
	public void addLineUpInfo(){
		System.out.println("A que equipo quiere añadir la alineacion?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			System.out.println("Cual es la tatica de la alineacion?");
			String tactics=sc.nextLine();
			System.out.println("Cual es la fecha de esta alineacion? (En el formato dd/mm/aaaa)");
			String date=sc.nextLine();
			System.out.println("Cual es la formación (de la forma n-n-n-n...-n)");
			String lineUp=sc.nextLine();
			if(club.addsTen( index-1,  lineUp))
				club.addLineUp( index-1,  lineUp,  date,  tactics);
			else
				System.out.print("La formación debe sumar 10");
		}else
			System.out.println("Este equipo no es valido");
	}
	
	/**
	*The method aks the user for the parameters for the method showLineUp from the class Club<br>
    *<b>pre:The creation of the methods printTeamNames() and showLineUp()  </b> 
	*<b>post: </b>
	*/	
	public void showLineUpInfo(){
		System.out.println("A que equipo quiere añadir la alineacion?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			System.out.println(club.showLineUp(index-1));
			
			
		}else
			System.out.println("Este equipo no es valido");
		
		
	}
	
}
	
