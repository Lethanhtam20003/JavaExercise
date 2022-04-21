package CauLenhReNhanh;

public class Bai_7 {
	static public boolean NamNhuan(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static public void textMonth(int month) {
		if (month > 12 && month < 1) {
			System.out.println("thang phap vao bi sai!");
		}
	}

	static public int tinhThangTrongNam(int year, int month) {
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if (NamNhuan(year)) {
				days = 28;
			} else {
				days = 29;
			}
			break;
		}

		return days;
	}

	public static void main(String[] args) {
		int month = 2, year = 2020,days=tinhThangTrongNam(year, month);
		if (NamNhuan(year)) {
			System.out.println("nam: " + year + " la nam nhuan;");
		} else {
			System.out.println("nam: " + year + " ko la nam nhuan;");
		}
		System.out.println("thang: "+month+" nam: "+year+" co: "+days+" ngay.");
	}
}
