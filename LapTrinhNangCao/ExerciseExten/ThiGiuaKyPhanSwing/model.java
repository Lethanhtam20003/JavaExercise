package ThiGiuaKyPhanSwing;

import java.util.Random;

public class model {
	static public int[] numberSequence(int lenght) {
		int[] res = new int[lenght];
		Random rd = new Random();
		for (int i = 0; i < res.length; i++) {
			res[i] = rd.nextInt(-10, 10);
		}
		return res;
	}

	static public boolean increasingNumberSequence(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] >a[i=1]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int[] a = numberSequence(5);
		for (int c : a)
			System.out.print(c + "\t");
	}
}
