package ctec.controller;

import java.util.ArrayList;

import ctec.model.DonaldTrump;
import ctec.model.MyMom;
import ctec.model.RamenFlavor;

public class InheritanceController 
{

	
	
	public InheritanceController()
	{
		makeRamenFlavorList();
	}
	
	private ArrayList<RamenFlavor> ramenFlavorList;
	
	public String showRamenFlavors()
	{
		String ramenFlavors = "";
		for(RamenFlavor currentFlavor : ramenFlavorList)
		{
			ramenFlavors.concat("This is a " + currentFlavor.toString() +
					" and it's price is: " + currentFlavor.Price() + "\n");
		}
		return ramenFlavors;
	}
	
	private void makeRamenFlavorList()
	{
		ramenFlavorList.add(new DonaldTrump());
		ramenFlavorList.add(new MyMom());
	}
	
	
	
	public void start()
	{
		
	}
	
	
	
	private void swap(int firstLocation, int secondLocation)
	{
		RamenFlavor temp = ramenFlavorList.get(firstLocation);
		ramenFlavorList.set(firstLocation, ramenFlavorList.get(secondLocation));
		ramenFlavorList.set(secondLocation, temp);
	}
	
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < ramenFlavorList.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (ramenFlavorList.get(innerLoop-1).compareTo(ramenFlavorList.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		RamenFlavor pivot = ramenFlavorList.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(ramenFlavorList.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, high);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
	

}
