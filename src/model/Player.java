package model;

public class Player extends Employee implements Profitable {
	private int shirtNumber;
	private int goalsScored;
	private double averageRating;
	private Position position;
	
	public Player(String name, String id, double salary,int shirtNumber, int goalsScored, double averageRating, Position position){
		super(name,id,salary);
		this.shirtNumber=shirtNumber;
		this.goalsScored=goalsScored;
		this.averageRating=averageRating;
		this.position=position;
	}
	
	public double calculateMarketPrice(){
		double price=0.0;
		if(position.name().equals("GOALKEEPER"))
			price =super.getSalary()*12 + averageRating*150;
		else if(position.name().equals("DEFENDER"))
			price =super.getSalary()*13 + averageRating*125+goalsScored*100;
		else if(position.name().equals("MIDFIELD"))
			price =super.getSalary()*14 + averageRating*135+goalsScored*125;
		else if(position.name().equals("STRICKER"))
			price =super.getSalary()*15 + averageRating*145+goalsScored*150;
		return price;
	}
	
	public double calculateStars(){
		double stars=0.0;
		if(position.name().equals("GOALKEEPER"))
			stars =averageRating*0.9;
		else if(position.name().equals("DEFENDER"))
			stars =averageRating*0.9 + goalsScored/100;
		else if(position.name().equals("MIDFIELD"))
			stars =averageRating*0.9+goalsScored/90;
		else if(position.name().equals("STRICKER"))
			stars =averageRating*0.9+goalsScored/80;
		return stars;
	}
	
	@Override 
	public String employeeToString(){
	String print="";
	print+=super.employeeToString();
	print+="Numero de camiseta: "+shirtNumber+"\n"+
	"Goles anotados: "+goalsScored+"\n"+
	"Calificacion promedio: "+averageRating+"\n"+
	"Posicion: "+position.name()+"\n"+
	"Precio del mercado: "+calculateMarketPrice()+"\n"+
	"Nivel del jugador: "+calculateStars()+"\n"; 
	
	return print;
	}
	
}