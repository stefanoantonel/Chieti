package ar.edu.ucc.bda.web.modelo;

import java.util.ArrayList;

public class Promo extends Product{

	private ArrayList<Item> items;
	
	public void addItem (Item i)
	{
		items.add(i);
	}
	
	public void removeItem (Item i)
	{
		
	}
}
