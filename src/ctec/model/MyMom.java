package ctec.model;


import java.util.ArrayList;

public class MyMom extends Humans 
{

	
	
	public MyMom()
	{
		this.setAge(13);
		this.setHairInfo(getHairInfo());
		this.setFun(true);
	}
	
	
	private ArrayList<String> myMomHairInfo()
	{
		ArrayList<String> hairInfo = new ArrayList<String>();
		
		
		hairInfo.add("blonde");
		hairInfo.add("thick");
		hairInfo.add("Long");
		
		
		
		return hairInfo;
	}
}
