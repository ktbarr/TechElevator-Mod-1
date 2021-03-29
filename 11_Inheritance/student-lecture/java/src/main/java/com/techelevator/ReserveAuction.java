package com.techelevator;

public class ReserveAuction extends Auction //--> step 1
{
	
	private int reservePrice; // step 4
	
	public ReserveAuction(String itemForSale, int reservePrice) // --> step 2
	{
		super(itemForSale); // --> step 3
		
		this.reservePrice = reservePrice; // step 5 // step 6 add to step 2
	}

	public int getReservePrice() // step 6 --> create getter
	{
		return reservePrice;
	}
	
	
	@Override								// step 7 --> create override for what is different than OG function. 
	public boolean placeBid(Bid offeredBid) 
	{
		if(offeredBid.getBidAmount() >= reservePrice) 
		{
			return super.placeBid(offeredBid);  // have to say super. because you are referring back to the OG class
		}
		
		return false;
	}
}
