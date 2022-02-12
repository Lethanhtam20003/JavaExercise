package EX6_1;

import junit.framework.TestCase;

public class IAssistsRealEstateAgentsTest extends TestCase {
	public void testConstructor() {
		 // Testing for Constructor of Addrest
		 Addrest a1 = new Addrest(12,"hai ba trung" ,"ha noi" );
		 Addrest a2 = new Addrest(112,"quang trung", " hai phong");
		 Addrest a3 = new Addrest(768,"ly thuong kiet:","ho chi minh");
		 // Testing for constructor of House
		 House h1 = new House("hai tang",12,100000,a1);
		 House h2 = new House("biet thu",18,200000,a2);
		 House h3 = new House("ba tang",10,150000,a3);
		 //  Testing for Constructor of ConsHouse
		 ConsHouse c1 = new ConsHouse(h1,new ConsHouse(h2, new ConsHouse(h3, new MTHouse())));
	}
}
