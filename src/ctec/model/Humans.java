package ctec.model;

import java.util.ArrayList;


public abstract class Humans implements RamenFlavor, Comparable
{

	private double age;
	private ArrayList<String> hairInfo;
	private boolean isFun;

	public double getAge() 
	{
		return age;
	}

	public ArrayList<String> getHairInfo() 
	{
		return hairInfo;
	}

	public boolean isFun() 
	{
		return isFun;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void setHairInfo(ArrayList<String> hairInfo) {
		this.hairInfo = hairInfo;
	}

	public void setFun(boolean isFun) {
		this.isFun = isFun;
	}
	
	
	public String toString()
	{
		String humanDescription = "This is a human of type: " + this.getClass().getName() + " and is " + getAge();
		
		return humanDescription;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof RamenFlavor)
		{
			if(this.Price() < ((RamenFlavor) compared).Price())
			{
				comparedValue = -1;
			}
			else if(this.Price() > ((RamenFlavor) compared).Price())
			{
				comparedValue = 1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}

}

