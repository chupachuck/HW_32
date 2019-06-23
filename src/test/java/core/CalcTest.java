package core;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalcTest {


//	@Test
//	public void testMain() {
//		fail("Not yet implemented");
//	}
	
//	@Test
//	public void testAdd2Function() {
//		assertEquals(5, Calc.add2(2, 3));
//	}
//	
//	//@SuppressWarnings("deprecation")
//	@Test
//	public void testAdd3Function() {
//		assertEquals("Ne verno!!", 9, Calc.add3(1.4, 3.6, 4), 0.09);
//	}
	
    // adding two integer values. 
    public int add(int a, int b){ 
           
        int sum = a+b; 
        return sum; 
    } 
       
    // adding three integer values. 
    public int add(int a, int b, int c){ 
           
        int sum = a+b+c; 
        return sum; 
    } 
    

	static double divide(double a, double b) {return a / b;}
	static double divide(double a, double b, double c) {return a / b / c;} 
	static double divide(double a, double b, double c, double d) {return a / b / c / d;}
	
	static double add(double a, double b) {return a + b;}
	static double add(double a, double b, double c) {return a + b + c;} 
	static double add(double a, double b, double c, double d) {return a + b + c + d;}
	
	static double substract(double a, double b) {return a - b;}
	static double substract(double a, double b, double c) {return a - b - c;} 
	static double substract(double a, double b, double c, double d) {return a - b - c - d;}
	
	static double multiply(double a, double b) {return a * b;}
	static double multiply(double a, double b, double c) {return a * b * c;} 
	static double multiply(double a, double b, double c, double d) {return a * b * c * d;}
	

	@Test // Ignore
	public void test_01() {assertEquals("Not correct", divide(88.0, 7.0), 13.5614285714, 0.99);}
	
	@Test // Ignore
	public void test_02() {assertEquals("Not correct", add(160.0, 5.0, 7.0), 72.0, 0.09);}
	
	@Test // Ignore
	public void test_03() {assertEquals("Not correct", substract(100.0, 22.0), 78.0, 0.09);}
	
	@Test // Ignore
	public void test_04() {assertEquals("Not correct", multiply(4.0, 12.0), 48.0, 0.09);}
	
	@Test  @Ignore
	public void test_05() {assertEquals("Not correct", add(12345.0, 155.0), 12400.0, 0.09);}
	
	@Test // Ignore
	public void test_06() {assertEquals("Not correct", substract(45.0, 15.0), 30.0, 0.09);}
	
	@Test // Ignore
	public void test_07() {assertEquals("Not correct", divide(18.0, 6.0), 3.0, 0.09);}
	
	@Test // Ignore
	public void test_08() {assertEquals("Not correct", multiply(15.0, 12.0), 60.0, 0.09);}
	
	@Test  // Ignore
	public void test_09() {assertEquals("Not correct", add(13.0, 78.0), 81.0, 0.09);}
	
	@Test // Ignore
	public void test_10() {assertEquals("Not correct", divide(112.0, 3.0), 4.0, 0.09);}
	
	
	
	
	
	
}
