package bt11_19;

/**
 * Bài Tập 19. Viết chương trình tính nghiệm phương trình bậc II, nhận vào 3 giá
 * trị a,b,c.
 * 
 * @author lethanhtam
 *
 */


public class BT19 {
	public static void SolveTheEquationOfDegreeI(int a, int b) {
		double x = 0;
		if (a == 0) {
			System.out.println("The equation has no solution!");
		} else {
			System.out.println("the equation has solution: ");
			x = -b / (double) a;
			System.out.println("x = "+x);
		}
	}

	public static void SolveTheEquationOfDegreeII(int a, int b, int c) {
		if (a == 0) {
			System.out.println("Degenerate equation! \n =>Go to slove euation of degree I");
			SolveTheEquationOfDegreeI(b, c);
		} else {
			double deta = b * b - 4 * a * c;
			if (deta > 0) {
				System.out.println("the equation has two solution: ");
				double x1 = (double)(-b + Math.sqrt(deta)) / (2 *  a);
				double x2 = (double)(-b - Math.sqrt(deta)) / (2 *  a);
				System.out.println("x1 = " + x1 + "\nx2 = " + x2);
			} else if (deta == 0) {
				System.out.println("the equation has one double solution: ");
				double x = (double)-b / 2 *  a;
				System.out.println("x1 = x2 = " + x);
			} else {
				System.out.println("the equation has no solution!");
			}
		}

	}
	
	 public static void main(String[]  args) {
		 int a=0,b=4,c=-6;
		 System.out.println("Slove the equation of degree II:");
		 SolveTheEquationOfDegreeII(a, b, c);
	 }

}

