package CauLenhReNhanh;

public class Bai_6 {
	static public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int a=10, b=8, max = max(a, b);
		System.out.println("so a: "+a+", so b: "+b+"");
		System.out.println("max: "+max);
			
	}
}
