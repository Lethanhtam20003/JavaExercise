package Ex8_2;

import junit.framework.TestCase;

public class IMailTest extends TestCase {
	public void testConstructor() {
		MessagesMail m1 = new MessagesMail("luny", "diva","23/3/3 quang trung",new Date(12, 4, 2022), "birthday present");
		MessagesMail m2 = new MessagesMail("hali", "luba", "11/232/21/ hai ba trung", new Date(13, 4, 2022), " delivery");
		MessagesMail m3 = new MessagesMail("meria","lui bạch tuyết","33 huynh tuan phat",new Date(13, 5, 2021),"pay bill");
		IMail i = new ConsMail(m1, new ConsMail(m2,new ConsMail(m3, new MTMail())));
		System.out.println(i);
	}
	
	public void testSoftByDate() {
		MessagesMail m1 = new MessagesMail("luny", "diva","23/3/3 quang trung",new Date(12, 4, 2022), "birthday present");
		MessagesMail m2 = new MessagesMail("hali", "luba", "11/232/21/ hai ba trung", new Date(13, 4, 2022), " delivery");
		MessagesMail m3 = new MessagesMail("meria","lui bạch tuyết","33 huynh tuan phat",new Date(13, 5, 2021),"pay bill");
		IMail i = new ConsMail(m1, new ConsMail(m2,new ConsMail(m3, new MTMail())));
		System.out.println(i.softByDate());
	}
	

}