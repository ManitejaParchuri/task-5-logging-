package interest;

public class SiandCi {
	
		static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("Interest.class");
		
			
		
		double simpleinterest(float pricipalamount,float rateofinterest,int time)
		{
			if(pricipalamount==0 || rateofinterest==0 || time==0)
			{
				Logger .warn("pricipal or rate of interst or time is 0");
			}
			double simpleinterest=(pricipalamount*rateofinterest*time*12)/100;
			Logger . debug("simple interest"+simpleinterest );
			return simpleinterest;
			
		}
		double compoundinterest(float pricipalcompound,float rateofinterestcompound,int timecompound)
		{
			if(pricipalcompound==0 || rateofinterestcompound==0 || timecompound==0)
			{
				Logger .warn("pricipal or rate of interst or time is 0");
			}
			
			double compoundinterest = pricipalcompound* (Math.pow((1 + rateofinterestcompound / 100), timecompound));
			Logger . debug("compound interest"+compoundinterest );
			return compoundinterest;
		}
		

	}


