package com.techelevator;

public class BuyoutAuction extends Auction  // extends Auction --> inherits Auction class (super class/base class)
{
	
	private int buyoutPrice;  // add what is different. also add to constructor below along with the this. statement. 
	private boolean noNewBids = false;
	
	//empty constructor --> super comes from Auction
	public BuyoutAuction(String itemForSale, int buyoutPrice)
	{
		// you must call the super constructor before you can do anything else
		// pass it the arguments that it needs. 
		// your error message can add it for you. check that... 
		
		// this gives it all the functionality of the Auction class. 
		super(itemForSale);
		
		this.buyoutPrice = buyoutPrice;
		noNewBids = false;
	}

	// can dynamically create this by hovering over the buyoutPrice above. 
	public int getBuyoutPrice()
	{
		return buyoutPrice;
	}
	
	
	// new code
	public void buyNow(Bid bid) 
	{
		if(bid.getBidAmount() >= buyoutPrice) 
		{
			boolean isHighBid = placeBid(bid);
			noNewBids = isHighBid;
			// end the auction
		}
	}

	@Override     //this has to exactly match what you are overriding (first line)
	public boolean placeBid(Bid offeredBid) 
	{
		// still allowing bids
		if(!noNewBids) 
		{
			return super.placeBid(offeredBid);
		}
		return false;
	}

	public boolean isNoNewBids()
	{
		return noNewBids;
	}
	
}
