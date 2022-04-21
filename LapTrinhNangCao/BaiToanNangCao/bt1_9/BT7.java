package bt1_9;

	/**
	 * ) Dùng xor để mã hóa và giải mã chuỗi bất kỳ với password là 1 byte. Mở rộng
	 * cho password là chuỗi bất kỳ (kỹ năng tiền xử lý dữ liệu)
	 * 
	 * @author lethanhtam
	 *
	 */
	public class BT7 {
		static public String mahoa(String text,int passwd) {
			int c;
			String res="";
			for(int i=0;text.length() >i ;i++) {
				c= text.charAt(i);
				c= c^passwd;
				res= res+(char)c;
				
			}
			return res;
		}
		
		public static void main(String[] args) {
			String text = ("alibaba va 30 cây mã tấu");
			int passwd = 14411;
			String ma = mahoa(text,passwd);
			System.out.println("textt : " + ma );
			System.out.println("sau:"+mahoa(ma, passwd));
		}
}
