package interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Renttest {

	@Test
	public void testConstructioncost() {
		Rentcost h=new Rentcost();
		assertEquals(18001.00,h.constructioncost("standard",0),0);
	}

}
