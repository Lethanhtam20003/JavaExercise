package EquationnOfDegreeII;

public class Condition {
	Program pt = new Program();

	public void nhap() {
		pt.nhap();
	}

	public void testCondition() {
		if (pt.a == 0) {
			System.out.println("Degenerate equation! \n =>Go to slove euation of degree I");
			if (pt.b == 0) {
				System.out.println("The equation has no solution!");
			} else {
				System.out.println("The equation has one solution:");
				pt.nghiemduynhat();
			}
		} else {
			if (pt.tinhdelta() > 0) {
				System.out.println("The equation has two solution:");
				pt.nghiemphanbiet();
			} else if (pt.tinhdelta() == 0) {
				System.out.println("The equation has one double solution:");
				pt.nghiemkep();
			} else {
				System.out.println("The equation has no solution");
			}
		}
	}
}
