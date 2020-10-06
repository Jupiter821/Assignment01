//Name: Samantha Lee
//Class: CSE360
//Date: 10-6-2020
//Assignment: 1

package cse360assignment01;

public class AddingMachine {
	private int total;

	public AddingMachine() 
	{	
		total = 0; //not needed - included for clarity
	}

	public int getTotal()
	{
		return total;
	}

	public void add(int value)
	{
		total = total + value;
	}

	public void subtract (int value)
	{
		total = total - value;
	}

	public String toString()
	{
		System.out.println(getTotal());
		add(4);
		System.out.println(" + " + getTotal());
		subtract(2);
		System.out.println(" - " + getTotal());
		add(5);
		System.out.println(" + " + getTotal());
		clear();
		return "";
	}

	public void clear()
	{
		total = 0;
	}

}
