package com.techelevator;

public class QuizDay5 {

	public static void main(String[] args) {

		/*question 2)
		 * int answer = 0
		 * 
		 * for(int i = 0; i < 10; i++) --> start at 0; less than 10; add 1 to each item
		 * 
		 * --> array --> [0] 0, [1] 1, [2] 2, [3] 3, [4] 4, [5] 5, [6] 6, [7] 7, [8] 8, [9] 9
		 * 
		 * if(i % 2 == 0) --> asking if the number is even
		 * answer = answer + i ---> 
		 * 
		 * loop:
		 * Loop 1 returns 0 --> 0 + 0 = 0
		 * Loop 2 does not meet criteria (1)
		 * Loop 3 returns 2 --> 0 + 2 = 2
		 * Loop 4 does not meet criteria (3)
		 * Loop 5 returns 4 --> 2 + 4 = 6
		 * Loop 6 does not meet criteria (5)
		 * Loop 7 returns 6 --> 6 + 6 = 12
		 * Loop 8 does not meet criteria (7)
		 * Loop 9 returns 8 --> 12 + 8 = 20
		 * Loop 10 does not meet criteria (9)
		 * array ends --> answer = 20
		 * 
		 * 
		 * 
		 * Question 3:
		 * 
		 * int sum = 0;
		 * 
		 * for( int i = 10;  --> start at 10
		 * 		i > 0;  --> I will always be greater than 0
		 * 		i -=3)  --> 10, 7, 4, 1 :numbers that qualify 
		 * {
		 * 
		 * 		sum += i; --> 10, is greater than zero, so subtract 3 ; i = 10
		 * 				  --> 7, is greater than zero, so subtract 3 ; i = 10 + 7 --> 17
		 * 				  --> 4, is greater than zero, so subtract 3 ; i = 17 + 4 --> 21
		 * 				  --> 1, is greater than zero, so subtract 3 ; i = 21 + 1 --> 22
		 * 				  --> -2, is NOT greater than zero, loop stops. (sum) is 22
		 * }
		 * 
		 * system out (sum)
		 * 
		 * 
		 * Question 4: which line will cause error? Line 5, because you declared in the for loop. Anything declared in 
		 * the for loop is ONLY available in the for loop (needs to be within the for loop { ..... } )
		 * 
		 * int sum = 0;
		 * for(int i = 0; i < 10; i++)
		 * 		sum += i;   --> implied to be { sum += i; }
		 * 
		 * int count = i;
		 *
		 * 
		 * Question 5:
		 * boolean [] first = {true, true, false, false };  [0] true, [1] true, [2] false, [3] false
		 * boolean [] second = first;						[0] true, [1] true, [2] false, [3] false
		 * 
		 * first[0] =false; --> changes [0] to false; ---> [0] false, [1] true, [2] false, [3] false
		 * second[2] = true; --> changes to [2] to true; ---> [0] false, [1] true, [2] true, [3] false
		 * 
		 * 
		 * 						first.length = 4
		 * for(int ix = 0; ix < first.length; ix++) 
		 * 
		 * int ix = 0 --> starts at 0
		 * ix < first.length --> length of first --> 4 (will loop 4 times)
		 * ix++ --> moves to next space +1
		 * 
		 * {
		 * 	boolean b = first[ix]
		 * 		Syso --> (b+"") --> display response + " " (response and space) (repeat 4 times)
		 * 
		 * loop: 
		 * false true true false 
		 * 
		 * 
		 * Question 6: Given the following loop: --> what is the printed output?
		 * 
		 * for(int i = 0; i < 5; i++){
		 * 		int sum = 0;
		 * 		sum += i;
		 * 		Syso - (sum + " ");
		 * }
		 * 
		 * for( int i = 0; i < 5; i++) --> starts at 0, less than 5, increasing by 1 --> 0, 1, 2, 3, 4
		 * {
		 * 		int sum = 0; --> this will always restart sum to 0 as it loops. 
		 * 		sum += i; --> sum is value of i
		 * 		Syso - (sum + " "); --> sum (space) 
		 * }
		 * 
		 * --> 0, 1, 2, 3, 4
		 * Loop 1 returns - 0 space --> starts back at 0
		 * -->
		 * Loop 2 returns - 1 space --> starts back at 0
		 * -->
		 * Loop 3 returns - 2 space--> starts back at 0
		 * -->
		 * Loop 4 returns - 3 space--> starts back at 0
		 * -->
		 * Loop 5 returns - 4 space--> starts back at 0
		 * -->
		 * 
		 * final print out is: 0space1space2space3space4 ---> 0 1 2 3 4
		 * 
		 * ** if you don't want sum to reset, has to be outside {}
		 * 
		 * Question 7: what is the value result?
		 * 
		 * int[] numbers = new int[10]; --> creating array with 10 items
		 * for(int ix = 0; ix < numbers.length; ix++) { --> array starts at 0, is less than the number of items (10), goes up by 1
		 * numbers[ix] = ix*2;
		 * }
		 * 
		 * int result = numbers[3];
		 * 
		 * results --> 
		 * array: [0] 0, [1] 1, [2] 2, [3] 3, [4] 4, [5] 5, [6] 6, [7] 7, [8] 8, [9] 9
		 * loop: find ix and * 2
		 * 		--> array values: [0] 0, [1] 2, [2] 4, [3] 6, [4] 8, [5] 10, [6] 12, [7] 14, [8] 16, [9] 18
		 * int result --> return value in [3] --> 6
		 */
		
	}
}