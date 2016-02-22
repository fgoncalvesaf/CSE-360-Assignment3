package cse360assign3;

/**
* Arizona State University
* CSE 360 - SOFTWARE ENGINEERING
* Assignment #: 3
* @author Francisco Goncalves de Almeida Filho
* @version 02.21.2016
* PIN: 321
* StudentID: 1210128241
* 
* Description: This class simulate a calculator.
*/

public class Calculator {
	
	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * This method return the total value.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method add a value to the total.
	 * @param value
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * This method subtract a value to the total.
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * This method multiply a value to the total.
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * This method divide the total by a value.
	 * @param value
	 */
	public void divide (int value) {
	
		if (value == 0)
			total = 0;
		
		else
			total /= value;
		
		history += " / " + value;
	}
	
	/**
	 * This method shows the history of the results.
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
	
}