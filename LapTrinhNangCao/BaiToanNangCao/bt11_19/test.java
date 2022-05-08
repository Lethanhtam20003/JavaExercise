package bt11_19;

import junit.framework.TestCase;

public class test extends TestCase {
	public void testBT15() {
		int[] arrLarge = { 1, 4, 6, 8, 2, 5, 6 };
		int[] arrSmall = { 5, 6};
		boolean belong = BT15.belong2(arrLarge, arrSmall);
		System.out.println(belong);
		assertEquals(belong, true);
	}
	public void testBT() {
		int[] arrLarge = { 1, 4, 6, 8, 2, 5, 6 };
		int[] arrSmall = { 5, 6};
		boolean belong = BT15.belong1(arrLarge, arrSmall);
		System.out.println(belong);
		assertEquals(belong, true);
	}
	public static void main(String[] args) {
		String txt = "Think of a card \"hdjh\"Hãy nghĩ về 1 lá bài ";
		System.out.println(txt);
	}
}
