package EX6_3;

import junit.framework.TestCase;

public class ARiverTest extends TestCase {
	public void testConstructor() {
		//Testing for constructor of Location
		 Location l1 = new Location("song ray",23,22);
		 Location l2 = new Location("song be",12,23);
		 Location l3 = new Location("song cau",23,83);
		 //Testing for constructor of Source 
		  ARiver r1 = new Source( new Location("e",1,3),222);
		  ARiver r2 = new Source( new Location("n",3,4),3232);
		  ARiver r3 = new Source( new Location("j",3,2),909);
		  //Testing for constructor of Confluence
		  Confluence c1 = new Confluence(l1,322,r1,null);
		  Confluence c2 = new Confluence(l2,1212,r2,r3);
		  Confluence c3 = new Confluence(l3,342,null,null);
		  
	}
}
