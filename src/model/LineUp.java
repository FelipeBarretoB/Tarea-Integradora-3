package model;

public class LineUp{
	private String date;
	private int[][] formation;
	private Tactics tactics;
	private String form;
	
	public LineUp(String date, String tactics){
		this.date=date;
		this.tactics=Tactics.valueOf(tactics.toUpperCase());
		formation=new int[10][7];
		form="";
	}
	
	public void setForm(String form){
		this.form=form;
	}
	//4-4-1-1
	//5-4-1
	public void fillFormation(){
		int index=0; 
		String[] num = form.split("-"); 
		int lines= 10/num.length;
		for(int c=9;c>=0 && index <num.length; c-=lines){
			fillLine( num, index, c );
			index++;
		}
		
	}
	
	public void fillLine(String[] num,int index,  int row ){
		int lines = 7/Integer.parseInt(num[index]);
		int i=0; 
		int y=0;
		int added=0;
		System.out.println("lines: "+7/Integer.parseInt(num[index]));
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
				System.out.println(Integer.parseInt(num[index]));
				System.out.println(i);
				formation[row][i]=1;
				formation[row][y]=1;
				i+=lines;
				y-=lines;
				added+=2;
			}while(added<=Integer.parseInt(num[index]));
		}
	}
	
	
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