package bt20_29;

/**
 * Bài Tập 21. a) Cho số tự nhiên n. Tính tổng S = 1 + 2 + … + n. b) Cho số tự
 * nhiên n. Tính giai thừa n! = 1 x 2 x … x n.
 * 
 * @author lethanhtam
 *
 */
public class BT21_TinhN {
	public static int a(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			res += i;
		}
		return res;
	}

	public static int b(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(a(5));
		System.out.println();
		System.out.println(b(5));
	}
}
