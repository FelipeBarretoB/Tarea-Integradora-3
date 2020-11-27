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
		for(int c=9;c<=0; c-=lines){
			fillLine( num, index, c );
			index++;
		}
		
	}
	
	public void fillLine(String[] num,int index,  int row ){
		int lines = 7/Integer.parseInt(num[index]);
		if(Integer.parseInt(num[0])%2==0){
			int i=4; 
			int y=2;
			for(int c=0;c<Integer.parseInt(num[index]);c++){
				formation[row][y]=1;
				formation[row][i]=1;
				i+=lines;
				c-=lines;
			}
		}else{
			int i=3; 
			int y=3;
			for(int c=0;c<Integer.parseInt(num[index]);c++){
				formation[row][i]=1;
				formation[row][y]=1;
				i+=lines;
				c-=lines;
			}
		}
	}
	
	
	public String printMatrix(){
		String print="";
		for(int c=0; c<formation.length;c++){
			print+="\n";
			for(int i=0; i<formation[c].length;i++){
				print+=formation[c][i]+"   ";
			}
		}
		return print; 
	}
	

	
}