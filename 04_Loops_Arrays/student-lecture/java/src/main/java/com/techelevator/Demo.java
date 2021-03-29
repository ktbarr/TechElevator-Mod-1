package com.techelevator;

public class Demo {

	public static void main(String[] args) {
	/*
	 * Loops *
	if : when this is used, will run through the steps and terminate at the end once result is returned
	while : this is a loop, unless there is a defined end, will continue to run.
		good when testing a condition that we don't know how many times it needs to be tested. (infinate loop)
	for : this is another loop, but you can set how many times you want it to loop. (limited loop)
			Step 1: variable - where are you starting
			Step 2: test - what you want it to do
			Step 3: increment operator  - how many times you want this to happen
	
	
	*/
		int counter = 0;
		
		while (counter < 5) 
		{
			System.out.println(counter);
			
	//		these are Increment Operators; all 3 of these are the same.
	//		counter = counter + 1;   
	//		counter += 1;
			counter++;
		}
		
		for (
				 int count = 10; // these should be on the same line, spaced like this gives you the steps.
				 count > 0; 
				 count -= 3) 
		{
			System.out.println(count);
		}
		
		System.out.println("end of program");

	}

}
