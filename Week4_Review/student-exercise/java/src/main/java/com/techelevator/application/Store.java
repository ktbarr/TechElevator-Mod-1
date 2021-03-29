package com.techelevator.application;

import com.techelevator.models.Inventory;
import com.techelevator.models.ShoppingCart;
import com.techelevator.models.products.Product;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

/**
 * The store class is the main application.
 * 
 * Responsibilities:
 *      manage the flow of the application
 * 
 * Dependencies:
 *      Inventory
 *      ShoppingCart
 *      CashRegister
 * 
 *      UI:
 *      UserInput
 *      UserOutput
 * 
 *      Utility:
 *      Logger - used to log errors and transactions
 */
public class Store 
{	
	
    
	private Inventory inventory = new Inventory();
	private ShoppingCart shoppingCart = new ShoppingCart();
	
    public void run()
    {

        while(true)
        {
            // display main menu - get their selection
            String option = UserInput.getHomeScreenOption();            

            if(option.equals("add"))
            {
                // do add item task
            	addToCart();
            }
            else if(option.equals("pay"))
            {

            	checkOut();
                // go to cash register to check out
            	
                break;
            }
            else if(option.equals("cart"))
            {

            	showCart();
            	// display the cart
            	
            }
            else if(option.equals("quit"))
            {

            	break;
            }
            else
            {

                // invalid option try again
            }

        }

    } 
    
    public void addToCart() 
    {
    	UserOutput.displayInventory(inventory);
    	
    	//show the products
    	//prompt for Input
    	String productId = UserInput.getSelectedProduct();
    	
    	// find the product based on the id
    	Product product = null;
    	for (Product currentProduct : inventory.getProducts()) 
    	{
    		if(currentProduct.getId().equals(productId)) 
    		{
    			product = currentProduct;
    			break;
    		}
    	}
    	// add that product to the cart
    	shoppingCart.add(product);
    }
    
    public void showCart() 
    {
    	// use the UserOutput to display 
    }
    
    public void checkOut() 
    {
    	
    }
}
    
   