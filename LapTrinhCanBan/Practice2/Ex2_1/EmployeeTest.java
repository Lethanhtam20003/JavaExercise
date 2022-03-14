package Ex2_1;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase
{
	public void testContructor()
	{
		new Employee ("nam",12);
	}
	
	 public void testWage() 
	 {
	      assertEquals(new Employee("Nam", 20).wage(), 240);
	      Employee aEmployee1 = new Employee("Mai", 30);
	      Employee aEmployee2 = new Employee("Minh", 102);     
	      assertEquals(aEmployee1.wage(), 360);
	      assertEquals(aEmployee2.wage(), 1224);
	  }
	 public void testTax() 
	 {
		 Employee aEmployee1 = new Employee("Mai", 30);
	     Employee aEmployee2 = new Employee("Minh", 102);     
	     assertEquals(aEmployee1.tax(),54.0);
	     assertEquals(aEmployee2.tax(),183.6);
	 }
	 public void testnetpay() 
	 {
		 Employee aEmployee1 = new Employee("Mai", 30);
	     Employee aEmployee2 = new Employee("Minh", 102);
		 assertEquals(aEmployee1.netpay(),306.0);
	     assertEquals(aEmployee2.netpay(),1040.4);
	 }
	 public void testraisedWage() 
	 {
		 Employee aEmployee1 = new Employee("Mai", 30);
	     Employee aEmployee2 = new Employee("Minh", 102);
		 assertEquals(aEmployee1.raisedWage(),374);
	     assertEquals(aEmployee2.raisedWage(),1238);
	 }
	 
	 
	public void testCheckOverTime()
	{
	      assertFalse(new Employee("Nam", 20).checkOverTime());
	      Employee aEmployee1 = new Employee("Mai", 30);
	      Employee aEmployee2 = new Employee("Minh", 102);
	      assertFalse(aEmployee1.checkOverTime());   
	      assertTrue(aEmployee2.checkOverTime());
	}
}
