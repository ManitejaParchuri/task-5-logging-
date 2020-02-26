package interest;



public class Rentcost {
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("Houserent.class");
	
	public double constructioncost(String material,double area)
	{
		Logger .info("Entered into method");
		
		if(area==0)
		{
			Logger . warn("area is zero" );
		}
		int cost;
		if(material=="standard")
		{
			 cost=1200;
			
		}
		else if(material=="abovestandard")
		{
			 cost=1500;
		}
		else if(material=="highstandard")
		{
			 cost=1800;
		}
		else
		{
			 cost=2500;
		}
		double totalcost=area*cost;
		Logger .info("Rent is");
		Logger . debug("Total Cost"+totalcost );
		return totalcost;
		
	}

}
