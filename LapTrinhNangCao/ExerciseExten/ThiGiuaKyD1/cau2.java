package ThiGiuaKyD1;
/**
 * cho 1 dãy n số. kiểm tra xem dã có có dan dấu hay ko. ví dụ dãy sau là dan dấu 2 -1 7 -8 4 -9
 * @author lethanhtam
 *
 */
public class cau2 {
	static public boolean dayDanDau(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]*a[i+1]>0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {1,-2,3,-4,5,-6};
		for(int i: a) {
			System.out.print(i+"\t");
		}
		if(dayDanDau(a)) {
			System.out.println(" la day dan dau");
		}else {
			System.out.println("ko la dau dan dau");
		}
	}
}
