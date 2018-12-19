package test;

import static org.junit.Assert.*;
import org.junit.Test;
import pack.tax;
public class test1 {
	
	tax tax = new tax();
	
	@Test
	public void testTax() throws InterruptedException
	 {
	 
	 double res= tax.calcTax(330000, 3, 30);
	 double toch=97260.0;
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }
}