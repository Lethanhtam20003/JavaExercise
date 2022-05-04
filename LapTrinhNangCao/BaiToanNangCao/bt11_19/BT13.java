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
	static public void printArr2(char[][] arr) {
		for (int row = 0; arr.length > row; row++) {
			for (int column = 0; arr[row].length > column; column++) {
				System.out.print(arr[row][column] + "\t");
			}
			System.out.println();
		}
	}

	static public String MaHoa(String a) {
		String res = "";
		int bonho = (a.length() % 5 == 0) ? a.length() / 5 : a.length() / 5 + 1;
		char[][] matMa = new char[bonho][5];
		a = a.replace(' ', '-');
		for (int row = 0, index = 0; matMa.length > row; row++) {
			for (int column = 0; matMa[row].length > column; column++) {
				matMa[row][column] = (index < a.length()) ? a.charAt(index) : '-';
				index++;
			}
		}
		for (int column = 0; matMa[0].length > column; column++) {
			for (int row = 0; matMa.length > row; row++) {
				res += matMa[row][column];
			}
		}
		return res;
	}

	static public String GiaMa(String a) {
		String res = "";
		int bonho = (a.length() % 5 == 0) ? a.length() / 5 : a.length() / 5 + 1;
		char[][] matMa = new char[bonho][5];
		a = a.replace('-', ' ');
		for (int column = 0, index = 0; matMa[0].length > column; column++) {
			for (int row = 0; matMa.length > row; row++) {
				matMa[row][column] = a.charAt(index);
				index++;
			}
		}
		for (int row = 0; matMa.length > row; row++) {
			for (int column = 0; matMa[0].length > column; column++) {
				res += matMa[row][column];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String a = "I am student";
		System.out.println(a.length());
		String b = "he is a good student !    oo really  ";
		System.out.println();
		System.out.println(MaHoa(a));
		System.out.println();
		System.out.println(GiaMa(MaHoa(a)));

	}
}
