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
		
		if(((form.length()+1)/2)==4){
			for(int i=formation.length-1; i<=0;i--){
				if(i%2==0){
					for(int y=0;y<formation[i].length;y++){
						int playersInLine=(int)form.charAt(index);

					}
					index+=2;
				}
			}
		}
		
		
		
	}
	
	public void fillLine(int row){
		
	}
	
}