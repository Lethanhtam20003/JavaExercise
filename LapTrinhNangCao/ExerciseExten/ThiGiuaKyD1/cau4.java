package ThiGiuaKyD1;

/**
 * cho chuổi s. mã hóa chuổi s bằng cách dịch chuyển các ký tự trông chuổi s
 * tiến tới 3 đơn vị trông bảng chữ cái chỉ mã hóa với các ký tự trông khoảng
 * a-z A-Z 0-9.các ký tự khác giữ nguyên
 * 
 * @author lethanhtam
 *
 */
public class cau4 {
	static public String emcrypt(String s) {
		String res = "";
		char[] arr= s.toCharArray();
		for (char remember :arr) {
			boolean cheak1 = remember >= 'a' && remember <= 'z';
			boolean cheak2 = remember >= 'A' && remember <= 'Z';
			boolean cheak3 = remember >= '0' && remember <= '9';
			if (cheak1 || cheak2 || cheak3) {
				remember= (char)(remember + 3);
				res+=remember;
			}else{
				res+=remember;
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
