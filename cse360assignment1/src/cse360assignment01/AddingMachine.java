//Name: Samantha Lee
//Class: CSE360
//Date: 10-6-2020
//Assignment: 1

package cse360assignment01;

public class AddingMachine {
	private int total;
	String history;

	//constructor
	//initializes total to 0
	public AddingMachine() 
	{	
		total = 0; //not needed - included for clarity
		history = "0";
	}

	//returns total
	public int getTotal() 
	{
		return total;
	}

	//adds value to total 
	public void add(int value)
	{
		total = total + value;
		history = history + " + " + value;
	}

	//subtracts value from total
	public void subtract (int value)
	{
		total = total - value;
		history = history + " - " + value;
	}

	//returns concatenated string of operations and values
	public String toString()
	{
		return history;
	}

	//sets total back to zero
	public void clear()
	{
		total = 0;
	}
}
