package interest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Interesttest {
	SiandCi i;
	@Before
	public void init()
	{
		i=new SiandCi();
	}

	@Test
	public void test() {
		assertEquals(288,i.simpleinterest(0,2,1),0);
		assertEquals(1223.9999771118164,i.compoundinterest(1200,2,1),0);
	}

}
