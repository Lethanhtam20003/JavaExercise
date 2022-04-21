package CauLenhReNhanh;

public class Bai_9 {
	static public void PhuongTrinhBacHai(int a, int b, int c) {
		double x = 0, deta;
		if (a == 0) {
			System.out.println("he suy bien ve bac nhat");
			Bai_8.PhuongTrinhBacNhat(b, c);
		} else {
			deta = b * b - 4 * a * c;
			if (deta == 0) {
				x = -b / (2 * a);
				System.out.println("he co 1 nghiem duy nhat: x= " + x);
			} else if (deta < 0) {
				System.out.println("he vo nghiem");
			} else {
				double x1, x2;
				x1 = (-b + Math.sqrt(deta)) / 2 * a;
				x2 = (-b - Math.sqrt(deta)) / 2 * a;

				System.out.println("he co 2 nghiem phan biet: \n x1= " + x1 + ", \n x2= " + x2);
			}
		}

	}

	public static void main(String[] args) {
		int a = -4, b = 6, c = 2;
		System.out.println("a= " + a + ", b= " + b + ", c=" + c 
				+ "\nta co he : \t " + a + "x^2+" + b + "x+" + c + "=0");
		PhuongTrinhBacHai(a, b, c);
	}
}
