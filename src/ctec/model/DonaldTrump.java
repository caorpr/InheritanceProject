package ctec.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DonaldTrump extends Humans 
{
	
	
	public DonaldTrump()
	{
			this.setAge(13);
			this.setHairInfo(getHairInfo());
			this.setFun(true);
		}
		
		
		private ArrayList<String> donaldTrumpHairInfo()
		{
			ArrayList<String> hairInfo = new ArrayList<String>();
			
			
			hairInfo.add("blonde");
			hairInfo.add("thin");
			hairInfo.add("wiry");
			hairInfo.add("balding");
			
			
			
			return hairInfo;
	
	}


		@Override
		public String IsItDelicious() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public double Price() {
			return 5000000;
		}


		@Override
		public void coolDownTime(int numberOfMinutes) {
			for(int minutes = 0; minutes < numberOfMinutes; minutes++)
			{
				JOptionPane.showMessageDialog(null, "That cooled down fast!");
			}
			
		}


	



}
