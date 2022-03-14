package BT6;

import junit.framework.TestCase;

public class IDirectoryTest extends TestCase {
	public void testConstructor() {
		// Testing for the constructor of APhoneNumber
		  APhoneNumber p1 = new APhoneNumber("TAM", 343381361);
		  APhoneNumber p2 = new APhoneNumber("TUAN",927582967);
		  APhoneNumber p3 = new APhoneNumber("NHI", 927582967);
		 //Testing for the constructor of PhoneRecord
		  PhoneRecord r1 = new PhoneRecord(p1,3,20);
		  PhoneRecord r2 = new PhoneRecord(p2,4,00);
		  PhoneRecord r3 = new PhoneRecord(p3,0,30);
		  //Testing for the Constructor of ConsRecord
	      IDirectory i1 = new ConsRecord(r1, new ConsRecord(r2,new ConsRecord(r3, new MTDirectory())));
	      //Testing for the constructor of ConsPhone
	      IDirectory i2 = new ConsPhone(p1, new ConsPhone(p2, new ConsPhone(p3, new MTDirectory())));
	      System.out.println(i1);
	      System.out.println(i2);
	}
	public void testPhoneNumber() {
		// Testing for the constructor of APhoneNumber
		  APhoneNumber p1 = new APhoneNumber("TAM", 343381361);
		  APhoneNumber p2 = new APhoneNumber("TUAN",927582967);
		  APhoneNumber p3 = new APhoneNumber("NHI", 927582967);
		 //Testing for the constructor of PhoneRecord
		  PhoneRecord r1 = new PhoneRecord(p1,3,20);
		  PhoneRecord r2 = new PhoneRecord(p2,4,00);
		  PhoneRecord r3 = new PhoneRecord(p3,0,30);
		  //Testing for the Constructor of ConsRecord
	      IDirectory i1 = new ConsRecord(r1, new ConsRecord(r2,new ConsRecord(r3, new MTDirectory())));
	      //Testing for the constructor of ConsPhone
	      IDirectory i2 = new ConsPhone(p1, new ConsPhone(p2, new ConsPhone(p3, new MTDirectory())));
	      
	      System.out.println("phoneNUmber ===="+i1.phoneNumber(927582967, "TUAN"));
	      assertEquals(i1.phoneNumber(927582967, "TUAN"),	p1);
	}
}
