package com.techelevator;

public class InheritanceNotes
{

	public static void main(String[] args)
	{
		/*
		 *  Inheritance
		 * 
		 *  Auction Example
		 * 
		 * Bid
		 * 
		 * - bidder: String
		 * - bidAmount: int
		 * 
		 * + ctor(bidder: String, bidAmount: int)
		 * 
		 * + getBidder(): String
		 * + getBidAmount(): String
		 * 
		 * 
		 * Auction
		 * 
		 * - itemForSale: String
		 * - currentHighBid: Bid
		 * - allBids: List<Bid>
		 * 
		 * + ctor(itemForSale: String)
		 * 
		 * + getItemForSale(): String
		 * + getHighBid(): Bid
		 * + getAllBids(): List<Bid>
		 * 
		 * +placeBid(offeredBid: Bid): boolean
		 * 
		 * 
		 * ** Adding Additional Auctions
		 * 
		 * BuyoutAuction
		 * 
		 * - itemForSale: String
		 * - currentHighBid: Bid
		 * - allBids: List<Bid>
		 * - buyoutPrice: int --> new 
		 * 
		 * + ctor(itemForSale: String, buyoutPrice: int) --> inlcudes new buyotPrice
		 * + getItemForSale(): String
		 * + getHighBid(): Bid
		 * + getAllBids(): List<Bid>
		 * + getBuyoutPrice(): int --> includes new buyoutPrice
		 * 
		 *  creates a new method to buy now
		 * + buyNow(bid: Bid;
		 * 
		 * 
		 
		 * 
		 * ReserveAuction
		 * 
		 * - itemForSale: String
		 * - currentHighBid: Bid
		 * - allBids: List<Bid>
		 * - reservePrice: int --> new 
		 * 
		 *  * + ctor(itemForSale: String, reservePrice: int) --> inlcudes new reservePrice
		 * + getItemForSale(): String
		 * + getHighBid(): Bid
		 * + getAllBids(): List<Bid>
		 * + getReservePrice(): int --> includes new reservePrice
		 * 
		 * 
		 * EVERYTHING that is common should go in the AUCTION Class
		 * 
		 * ANYTHING that is individual should go into that class. 
		 * 
		 * public class BuyoutAuction extends Auction  // extends Auction --> inherits Auction class (super class/base class)
		 * 		--> this is currently erroring due to constructor; need to create it's own constructor. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
