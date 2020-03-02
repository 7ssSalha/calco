
import cal.Cal;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein
 */
public class testcases {
   

	@Test
	public void test() {
		Cal c = new Cal();
		assertEquals(c.add(2,3),5);
		
	}
 
}
