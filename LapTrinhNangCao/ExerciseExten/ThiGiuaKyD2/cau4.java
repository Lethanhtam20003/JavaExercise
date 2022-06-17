package ThiGiuaKyD2;
/**
 * cho chuổi s. mã hóa chuổi s bằng cách dịch chuyển các ký tự trông chuổi s lui 2 đơn vị trông bảng chữ cái 
 * chỉ mã hóa với các ký tự trông khoảng a-z A-Z 0-9.các ký tự khác giữ nguyên 
 * @author lethanhtam
 *
 */
public class cau4 {
	public static String emcrypt(String s) {
		String res="";
		char[] arr = s.toCharArray();
		for(int i =0;i<arr.length;i++) {
			boolean check1 = arr[i] >='a' && arr[i]<='z';
			boolean check2 = arr[i] >='A' && arr[i]<='Z';
			boolean check3 = arr[i] >='0' && arr[i]<='9';
			if(check1||check2||check3) {
				arr[i] =(char)( arr[i]-2) ;
				res+=arr[i];
			}else {
				res+=arr[i];
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		String s = "dsdjasdsa344@@AHJHas0";
		System.out.println(s);
		System.out.println(emcrypt(s));
	}
}
