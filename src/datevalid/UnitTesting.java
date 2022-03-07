package datevalid;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UnitTesting {
ValidationDate vd;
	@Before
	public void start()
	{
		vd=new ValidationDate();
		
	}
	@Test
	public void validerDate()
	{
		
		
		assertTrue(vd.verifjour(30, 4, 2012));
	}
}
