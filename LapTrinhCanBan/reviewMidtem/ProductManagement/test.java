package ProductManagement;

import junit.framework.TestCase;

public class test extends TestCase {
	Producer producer = new Producer("Makita", 0);
	ProductItems h1 = new HandTool("6307", "Máy khoan 13mm", producer, "Nhật Bản", 1.4, 1150000, "Điện");
	ProductItems h2 = new HandTool("201", "Bộ sản phẩm máy khoan,vặn vít", producer, "Trung Quốc", 3, 700000, "Pin");

	Producer producer2 = new Producer("TGM", 0);
	ProductItems g1 = new Generator("MM30N", "Mô tơ điện 1 pha vỏ gang 3HP 2.2KW", producer2, "vietnam", 23, 1500000,
			new day(1, 5, 2018));
	ProductItems g2 = new Generator("MM30C", "Mô tơ điện 1 pha vỏ nhôm 3HP 2.2KW ", producer2, "vietnam", 20, 2000000,
			new day(1, 4, 2018));
	ProductItems g3 = new Generator("MA40N", "Mô tơ điện 1 pha vỏ nhôm 4HP 3.0Kw", producer2, "vietnam", 21, 1000000,
			new day(3, 4, 2018));

	Producer producer3 = new Producer("Dewalt", 0);
	ProductItems c1 = new CuttingMachine("D28720", " Máy cắt sắt 355mm", producer3, "Trung Quốc", 20, 6500000);
	Producer producer4 = new Producer("Maktec", 0);
	ProductItems c2 = new CuttingMachine("MT413", "Máy cắt đá 110mm 1250W", producer4, "Trung Quốc", 2.9, 1160000);

	listProduct l = new ConsProduct(h1, new ConsProduct(h2, new ConsProduct(g1,
			new ConsProduct(g2, new ConsProduct(g3, new ConsProduct(c1, new ConsProduct(c2, new MTProduct())))))));
	BuyItems i1 = new BuyItems(h2, 5);
	BuyItems i2 = new BuyItems(g2, 7);
	BuyItems i3 = new BuyItems(c2, 9);
	listItems listitems = new ConsItems(i1, new ConsItems(i2, new ConsItems(i3, new MTItems())));
	Costumers costumer = new Costumers("le", "le@gmail.com", listitems);

	public void testConstructor() {
		Producer producer = new Producer("Makita", 0);
		ProductItems h1 = new HandTool("6307", "Máy khoan 13mm", producer, "Nhật Bản", 1.4, 1150000, "Điện");
		ProductItems h2 = new HandTool("201", "Bộ sản phẩm máy khoan,vặn vít", producer, "Trung Quốc", 3, 700000,
				"Pin");

		Producer producer2 = new Producer("TGM", 0);
		ProductItems g1 = new Generator("MM30N", "Mô tơ điện 1 pha vỏ gang 3HP 2.2KW", producer2, "vietnam", 23,
				1500000, new day(1, 5, 2018));
		ProductItems g2 = new Generator("MM30C", "Mô tơ điện 1 pha vỏ nhôm 3HP 2.2KW ", producer2, "vietnam", 20,
				2000000, new day(1, 4, 2018));
		ProductItems g3 = new Generator("MA40N", "Mô tơ điện 1 pha vỏ nhôm 4HP 3.0Kw", producer2, "vietnam", 21,
				1000000, new day(3, 4, 2018));

		Producer producer3 = new Producer("Dewalt", 0);
		ProductItems c1 = new CuttingMachine("D28720", "Máy cắt sắt 355mm", producer3, "Trung Quốc", 20, 6500000);
		Producer producer4 = new Producer("Maktec", 0);
		ProductItems c2 = new CuttingMachine("MT413", "Máy cắt đá 110mm 1250W", producer4, "Trung Quốc", 2.9, 1160000);

		listProduct l = new ConsProduct(h1, new ConsProduct(h2, new ConsProduct(g1,
				new ConsProduct(g2, new ConsProduct(g3, new ConsProduct(c1, new ConsProduct(c2, new MTProduct())))))));
		BuyItems i1 = new BuyItems(h2, 5);
		BuyItems i2 = new BuyItems(g2, 7);
		BuyItems i3 = new BuyItems(c2, 9);
		listItems listitems = new ConsItems(i1, new ConsItems(i2, new ConsItems(i3, new MTItems())));
		Costumers costumer = new Costumers("le", "le@gmail.com", listitems);
		System.out.println(l + "\n");
		System.out.println(costumer);
	}

	public void testGetName() {
		assertEquals(h1.getName(), "Máy khoan 13mm");
		assertEquals(c1.getName(), " Máy cắt sắt 355mm");
		assertEquals(g1.getName(), "Mô tơ điện 1 pha vỏ gang 3HP 2.2KW");

	}

	public void tetsIsProducer() {
		assertEquals(c1.isProducer("Dewalt"), true);
		assertEquals(h1.isProducer("Dewalt"), false);

	}

	public void testPromotionfee() {
		assertEquals(h1.promotionFree()	,0.75*1150000);
		assertEquals(c1.promotionFree(),0.8*6500000);
	}

	public void tetsHowManyHandToolsandGenerator() {
		assertEquals(l.howManyHandToolsAndGenerator(), 5);
	}

	public void testGetItemsOfNation() {
		System.out.println("vietnam\n"+l.getItemmOfNation("vietnam"));
	}

	public void testSortByProducer() {
		System.out.println("soft \n"+l.softByProducer());
	}

	public void testFinetotal() {
	assertEquals(costumer.fineTotal(), 700000*5*1.0+2000000*7+1160000*9);
	System.out.println(costumer.fineTotal());
	}
}
