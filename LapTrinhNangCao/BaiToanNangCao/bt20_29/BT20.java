package bt20_29;

/**
 * Bài Tập 20. Tính giai thừa
 * 
 * @author lethanhtam
 *
 */
public class BT20 {
	public static int TinhGiaiThua(int nNumber) {
		int res = 1;
		
			for (int i = 0; i < Math.abs(nNumber); i++) {
				res *= (Math.abs(nNumber) - i);
			}
			res=(nNumber>0)?res:-res;
			res=(nNumber==0)?0:res;
		return res;
	}

	public static void main(String[] args) {
		int nNumber = 0;
		int t = TinhGiaiThua(nNumber);
		System.out.println(t);
	}
}
