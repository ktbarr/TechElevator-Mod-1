package com.techelevator;

public class NotesDay5
{

	public static void main(String[] args)
	{
		/*
		 *
	 6. Given an array of ints length 3, 
	 return an array with the elements "rotated left" 
	 so {1, 2, 3} yields {2, 3, 1}.
	 
	 rotateLeft3([1, 2, 3]) = [2, 3, 1]
	 rotateLeft3([5, 11, 9]) = [11, 9, 5]
	 rotateLeft3([7, 0, 0]) = [0, 0, 7]
	 
		public int[]  --> return type
		rotateLeft3 --> name
		(int[] nums)  --> input
		{
		
			return new int[] {};
		}
		 * 
		 * array 1 (rotateLeft3) --> [0], [1], [2];
		 * array 2 (newNums) --> [1], [2], [3];
		 * 
		 * step 1: create new array -->
		 * step 2: copy items into new array -->
		 * step 3: return new array --> 
		 * 
		 * step 1: int [] newNums = new int[3]; --> create new array
		 * step 2: 
		 * 			newNums[0] = nums[1]; --> placing what was in nums[1] into newNums[0]
					newNums[1] = nums[2]; --> placing what was in nums[2] into newNums[1]
					newNums[2] = nums[0]; --> placing what was in nums[0] into newNums[2]
		 * 
		 * step 3: return newNums; --> return new array
		 * 
		 * 
		 * 7. Given an array of ints length 3, 
		 * return a new array with the elements in reverse order, so 
	 	 *		{1, 2, 3} becomes {3, 2, 1}.
	 	 *	
	 	 *	    reverse3([1, 2, 3]) = [3, 2, 1]
	 	 *		reverse3([5, 11, 9]) = [9, 11, 5]
	 	 *	    reverse3([7, 0, 0]) = [0, 0, 7]
		 * 
		 * public int[] reverse3(int[] nums) 
		 * {
		 * 	
		 * 
				return new int[] {};
				}
		 * 
		 * array 1: (reverse3) --> [0], [1], [2];
		 * 						   |	|    |
		 * array 2: (newArray) --> [2], [1], [0];
		 * 
		 * step 1: create new array -->
		 * step 2: copy items into new array -->
		 * step 3: return new array --> 
		 * 
		 * step 1: int [] newNums = new int[3]; --> create new array
		 * step 2: 
		 * 			newNums[0] = nums[1]; --> placing what was in nums[2] into newNums[0]
					newNums[1] = nums[2]; --> placing what was in nums[1] into newNums[1]
					newNums[2] = nums[0]; --> placing what was in nums[0] into newNums[2]
		 * 
		 * step 3: return newArray; --> return new array
		 * 
		 * Question 8:
		 *  Given an array of ints length 3, 
		 *  figure out which is larger between the first and last elements 
	 	 *  in the array, and 
	 	 *  set all the other elements to be that value. 
	 	 *  Return the changed array.
	 	 *  
	 	 *  maxEnd3([1, 2, 3]) = [3, 3, 3]
	 	 *  maxEnd3([11, 5, 9]) = [11, 11, 11]
	 	 *  maxEnd3([2, 11, 3]) = [3, 3, 3]
		 * 
		 *  public int[] maxEnd3(int[] nums) 
		 *  {
		 *  
		 *		return new int[] {};
	     *  }
		 * 
		 * Ex. 1
		 * array 1: 		[0] 1, [1] 2, [2] 3; 
		 * 					 |		|	   |
		 * updated array 1: [0] 3, [1] 3, [2] 3;
		 * 
		 * Step 1: find largest
		 * Step 2: create new array
		 * Step 3: change items from array 1 to largest
		 * Step 4: return new array
		 * 
		 * Step 1:
		 * 
		 * 
		 */

	}

}
