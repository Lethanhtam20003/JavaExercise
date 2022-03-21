package BT1;

import junit.framework.TestCase;

public class AssistsRealEstateAgentsTest extends TestCase {
	public void testConstructor() {
		 // Testing for AddRest
		 AddRest a1 = new AddRest(23,"Maple Street" ,"Brookline" );
		 AddRest a2 = new AddRest(5,"Joye round", "Newton");
		 AddRest a3 = new AddRest(83,"Winslow round","Waltham");
		 // Testing for House
		 House h1 = new House("Ranch",7,375000,a1);
		 
		 House h2 = new House("Cplonia",9,450000,a2);
		 House h3 = new House("Cape",6,235000,a3);
		 //  Testing for ConsHouse
		 ConsHouse c1 = new ConsHouse(h3, new ConsHouse(h2, new ConsHouse(h1,new MTHouse())));
		 System.out.println(c1);
	}
}
