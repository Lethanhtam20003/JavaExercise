package CauLenhReNhanh;

public class Bai1_15 {
	public static boolean checkDay(int day, int mont, int years) {
		switch (mont) {
		case 2:
			if (Bai_7.NamNhuan(years)) {
				if (day > 0 && day <= 29) {
					return true;
				} else {
					if (day > 0 && day <= 28) {
						return true;
					}
				}
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 0 && day <= 31) {
				return true;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 0 && day <= 30) {
				return true;
			}
			break;
		}
		return false;
	}
	public static void day(int day,int month,int year) {
		if(checkDay(day, month, year)) {
			System.out.println(day+"/"+month+"/"+year);
		}
	}
	public static void main(String[] args) {
		int day = 3;
		int mont = 3;
		int year = 2001;
		
		day(day, mont, year);
		
	}
}
