package ctec.model;

import java.util.ArrayList;


public abstract class Humans implements RamenFlavor
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

}

