package ar.edu.ucc.bda.web.modelo;

import java.io.Serializable;
import java.util.ArrayList;


public class Order implements Serializable {

	private int orderId;
	private User user;
	private ArrayList<Item> items;
	private ArrayList<Promo> promos;
	
	public float getTotal()
	{
		return 0;
	}
	
	public void addItem(Item i)
	{
		items.add(i);
	}
	public void removeItem(Item i)
	{
		
	}
	public void cancelProduct(){}
	private void printOrder(){}
	
}
