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


	@Override
	public String IsItDelicious() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double Price() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void coolDownTime(int numberOfMinutes) {
		// TODO Auto-generated method stub
		
	}

	
}
