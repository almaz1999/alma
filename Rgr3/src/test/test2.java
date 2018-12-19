package test;

import static org.junit.Assert.*;
import pack.MetodCalc;

public class test2 {

	 @org.junit.Test
	 public void testPlus()
	 {
		 MetodCalc mc = new MetodCalc();
		 double res= mc.calc(33, "+", 3);
		 assertEquals(Double.toString(36), Double.toString(res));
	 }
	
	 @org.junit.Test
	 public void test_Minus()
	 {
		 MetodCalc mc = new MetodCalc();
		 double res=mc.calc(66, "-", 26);
		 assertEquals(Double.toString(40), Double.toString(res));
	 }

	 @org.junit.Test
	 public void test_Multiply()
	 {
		 MetodCalc mc = new MetodCalc();
		 double res=mc.calc(111, "*", 4);
		 assertEquals(Double.toString(444), Double.toString(res) );
	 }
	
	 @org.junit.Test
	 public void test_Divide()
	 {
		MetodCalc mc = new MetodCalc();
		double res=mc.calc(81, "/", 9);
		assertEquals(Double.toString(9), Double.toString(res) );
	 }
}