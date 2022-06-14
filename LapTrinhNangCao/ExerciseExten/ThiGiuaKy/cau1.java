package ThiGiuaKy;

/**
 * cho số tự nhiên. c1 - điếm số đếm số chữ số nguyên đó. c-2 tìm số nghịch đảo.
 * 
 * @author lethanhtam
 *
 */
public class cau1 {
	public static int countNum(int numIP) {
		String a = String.valueOf(numIP);
		int count = a.length();
		return count;
	}

	public static int inverseNumber(int numIP) {
		StringBuilder a = new StringBuilder(numIP + "");
		a.reverse();
		return Integer.valueOf(a.toString());
	}

	public static int inverseNumber2(int numIP) {
		int count = String.valueOf(numIP).length();
		int res=0;
		if(count==1) {
			return numIP;
		}else {
			for(int i = count;i>0;i--) {
			res+=numIP%10*Math.pow(10, i-1);
			numIP/=10;
			}
			//chua hoan thanh phan nay
//			for(int i = 0;i>count;i++) {
//				res+=numIP%Math.pow(10, i);
//				numIP/=10;
//				}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(countNum(21321));
		System.out.println(inverseNumber(12345678));
		System.out.println(inverseNumber(02));
	}
}
