package ui;
import java.util.Scanner;
import model.Club;
public class Main{
	private Scanner sc;
	private Club club;
	
	public Main(){
		sc= new Scanner(System.in);
		club=new Club("SuperClub",12341421,"20/03/2000","Equipo 1","Equipo 2");
	}
	
	public static void main(String [] args){
		Main ui=new Main();
		int option=0;
		
		do{
			option= ui.showMenu();
			ui.executeOperation(option);
			
		}while (option!=0);
		
		
	}
	
	
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
				"(11) Para mostrar \n" +  
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
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
		default:
			System.out.println("Error, opción no válida");
		
		}
	}
	
	
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
	
	public void fireEmployeeInfo(){
		System.out.println("Cual es la id del empleado?");
		String id=sc.nextLine();
		if(club.checkId(id)){
			club.fireEmployee(id);
		}else 
			System.out.println("No existe ningun empleado con esta id");
	}
	
	public void findEmployeeInfo(){
		System.out.println("Cual es la id del empleado?");
		String id=sc.nextLine();
		if(club.checkId(id)){
			System.out.println(club.findEmployee(id));
		}else 
			System.out.println("No existe ningun empleado con esta id");
		
	}
	
	public void showTeamInfo(){
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1)
			System.out.println(club.showEmployee( index-1));
		else
			System.out.println("Este equipo no es valido"); 
	}
	
	public void fireClubEmployeeInfo(){
		System.out.println("Cual es la id del empleado?");
		String id=sc.nextLine();
		if(club.checkId(id)){
			club.fireClubEmployee(id);
		}else 
			System.out.println("No existe ningun empleado con esta id");
	}
	
	public void addClubEmployeeToTeamInfo(){
		System.out.println("A que equipo quiere añadir el empleado?");
		System.out.println(club.printTeamNames());
		int index=sc.nextInt();
		sc.nextLine();
		if(index-1<=1){
			System.out.println("Cual es la id del empleado");
			String id=sc.nextLine();
			if(club.checkId(id)){
				if(club.employeeHasTeam(id))
					club.addClubEmployeeToTeam(index-1, id);
				else
					System.out.println("El empleado ya tiene equipo"); 
			}else
				System.out.println("No existe ningun empleado con esta id");
		}else
			System.out.println("Este equipo no es valido");
	}
	
}
	
