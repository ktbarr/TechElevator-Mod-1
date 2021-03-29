package com.techelevator;

public class Elevator 
{
	// attributes
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	
	
	//constructor
	public Elevator(int numberOfLevels) 
	{
		this.numberOfFloors = numberOfLevels;
	}
	
	
	//derived // none for this exercise
	
	
	
	// methods
	
	public boolean isDoorOpen() 
	{
		return this.doorOpen;
	}
	
	public void openDoor() 
	{
		doorOpen = true;
	}
	
	
	public void closeDoor() 
	{
		doorOpen = false;
	}
	
	
	public void goUp(int desiredFloor) 
	{
		if (!this.doorOpen) 
		{
			if (desiredFloor <= numberOfFloors) 
			{
				if (desiredFloor > currentFloor) 
				{
					currentFloor = desiredFloor;
				}
			}
		}
	}
	
	
	public void goDown(int desiredFloor) 
	{
		if (!this.doorOpen) 
		{
			if (desiredFloor >= 1) 
			{
				if (desiredFloor < currentFloor) 
				{
					currentFloor = desiredFloor;
				}
			}
		}
	}
	
	
	//getters

	public int getCurrentFloor() 
	{
		return currentFloor;
	}
	
	public int getNumberOfFloors() 
	{
		return numberOfFloors;
	}
	
	public boolean getDoorOpen() 
	{
		return doorOpen;
	}
}
