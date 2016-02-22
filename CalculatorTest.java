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
* Description: This class tests the Calculator class.
*/

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	/**
	 * This method verify if the constructor does not return null
	 */
	public void testCalculator(){
		assertNotNull(new Calculator());
	}
	
	@Test
	/**
	 *
	 * This method verify if the total is correct
	 */
	public void testTotal(){
		Calculator number = new Calculator();
		number.add(10);
		number.multiply(2);
		assertEquals(number.getTotal(), 20);
	}
	
	@Test
	/**
	 * This method verify if a value is been added correctly
	 */
	public void testAdd(){
		Calculator number = new Calculator();
		number.add(10);
		number.add(2);
		assertEquals(number.getTotal(), 12);
	}
	
	@Test
	/**
	 * This method verify if a value is been subtracted correctly
	 */
	public void testSubtract(){
		Calculator number = new Calculator();
		number.add(10);
		number.subtract(2);
		assertEquals(number.getTotal(), 8);
	}
	
	@Test
	/**
	 * This method verify if the total is been multiplied correctly
	 */
	public void testMultiply(){
		Calculator number = new Calculator();
		number.add(10);
		number.multiply(3);
		assertEquals(number.getTotal(), 30);
	}
	
	@Test
	/**
	 * This method verify if the total is been divided correctly
	 */
	public void testDivide(){
		Calculator number = new Calculator();
		number.add(10);
		number.divide(2);
		assertEquals(number.getTotal(), 5);
		
		number.divide(0);
		assertEquals(number.getTotal(), 0);
	}
	
	@Test
	/**
	 * This method verify if the history is been shown correctly
	 */
	public void testHistory(){
		fail();
	}

}
