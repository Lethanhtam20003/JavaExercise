package CauLenhReNhanh;

public class Bai1_12 {
	static public void loaiTamGiac(int a, int b, int c) {
		if (Bai1_11.ditermineTamGiac(a, b, c)) {
			if (a == b && b == c) {
				System.out.println("tam giac deu.");
			}else if (a == b || a == c || b == c) {
				if (Math.sqrt(a * a + b * b) == c * c || Math.sqrt(a * a + c * c) == b * b
						|| Math.sqrt(c * c + b * b) == a * a) {

					System.out.println("tam giac vuong can");
				}else {
					System.out.println("tam giac can");
				}
			}else if (Math.sqrt(a * a + b * b) == c  || Math.sqrt(a * a + c * c) == b 
					|| Math.sqrt(c * c + b * b) == a ) {
				System.out.println("tam giac vuong");
			}else {
				System.out.println("tam giac thuong");
			}
		}
	}
	public static void main(String[] args) {
		int a = 3 ,b =3,c=5;
		loaiTamGiac(a, b, c);
	}
}
