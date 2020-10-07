//Name: Samantha Lee
//Class: CSE360
//Date: 10-6-2020
//Assignment: 1

package cse360assignment01;

public class Main {
		public static void main(String args[])
		{
			AddingMachine myCalculator = new AddingMachine(); //create an instance of the class
	
			myCalculator.add(4); //add 4
			myCalculator.subtract(2); //subtract 2
			myCalculator.add(5); //add 5
			System.out.println(myCalculator.toString()); //prints all operations and values
			System.out.println("Total: " + myCalculator.getTotal()); //prints total
			myCalculator.clear(); //clear total
		}
}
