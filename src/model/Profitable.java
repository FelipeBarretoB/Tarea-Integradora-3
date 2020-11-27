package model;

public interface Profitable{
	
	/**
	*The method returns the market price of te employee depending on the values of his fields <br>
    *<b>pre:   </b> 
	*<b>post:  </b>
	*@return double,the market price of the employee
	*/
	public double calculateMarketPrice();
	
	/**
	*The method returns the stars of te employee depending on the values of his fields <br>
    *<b>pre:   </b> 
	*<b>post:  </b>
	*@return double,the starts of the employee
	*/
	public double calculateStars();
	
	
}