package bt11_19;

/**
 * Bài Tập 13. (5) Một thuật toán mã hóa một thông điệp như sau: viết chuỗi
 * thông điệp theo dòng có n=5 cột, dòng cuối cùng được thêm các khoảng trắng
 * cho đầy dòng, rồi viết lại các ký tự của thông điệp đó theo cột.
 * 
 * @author lethanhtam
 *
 */
public class BT13 {
	static public void printArr2(String[][] arr) {
		for (int row = 0; arr.length > row; row++) {
			for (int column = 0; arr[row].length > column; column++) {
				System.out.print(arr[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static public int CountString(String a) {
		int count = a.length();
		return count;
	}

	static public int BoNho(int count) {
		int dem = 0, bonho = 0;
		while (dem < count) {
			dem += 5;
			bonho++;
		}

		return bonho;
	}

	static public String MaHoa(String a) {
		String res = "";
		int bonho = BoNho(CountString(a));
		String[][] matMa = new String[bonho][5];
		int bienChay = 0;
		char b, c = a.charAt(bienChay);
		for (int row = 0; matMa.length > row; row++) {
			for (int column = 0; matMa[row].length > column; column++) {
				String chuoi = String.valueOf(c);
				b = a.charAt(bienChay);
				if (b == ' ') {
					matMa[row][column] = "-";
				} else {
					matMa[row][column] = chuoi;
				}

				if (CountString(a) - 1 > bienChay) {
					bienChay++;
					c = a.charAt(bienChay);
				} else {
					c = '-';
				}

			}
		}
		for (int column = 0; matMa[0].length > column; column++) {
			for (int row = 0; matMa.length > row; row++) {
				res += matMa[row][column];
			}
		}
		System.out.println();
		printArr2(matMa);
		System.out.println();
		return res;
	}

	public static String GiaMa(String mahoa) {
		String res = "";
		int bonho = BoNho(CountString(mahoa));
		String[][] matMa = new String[bonho][5];
		int bienChay = 0;
		char b, c = mahoa.charAt(bienChay);
		for (int column = 0; matMa[0].length > column; column++) {
			for (int row = 0; matMa.length > row; row++) {
				String chuoi = String.valueOf(c);
				b = mahoa.charAt(bienChay);
				if (b == ' ') {
					matMa[row][column] = "-";
				} else {
					matMa[row][column] = chuoi;
				}

				if (CountString(mahoa) - 1 > bienChay) {
					bienChay++;
					c = mahoa.charAt(bienChay);
				} else {
					c = '-';
				}

			}
		}
		for (int row = 0; matMa.length > row; row++) {
			for (int column = 0; matMa[0].length > column; column++) {
				res += matMa[row][column];
			}
		}
		System.out.println();
		printArr2(matMa);
		System.out.println();
		return res;

	}

	public static void main(String[] args) {
		String a = "I am student";
		String b = "he is a good student ! really";
//		String mahoa = MaHoa(b);
//		String giama = GiaMa(mahoa);
		System.out.println();
		System.out.println(MaHoa(b));
		System.out.println();
		System.out.println(GiaMa(MaHoa(b)));

	}
}
