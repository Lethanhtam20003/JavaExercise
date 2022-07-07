package studyString;

public class methodChexk {
	public static void main(String[] args) {
		String s = new String("i love my family");
		System.out.println(s);
		// length lấy độ dài chuổi
		System.out.println("độ dài chuổi : "+s.length());
		//charAt lấy ký tự từ 1 vị trí (nhập vào vị trí)
		System.out.println("vị trí thứ 4 trông chuổi s :"+s.charAt(4));
		//getchars copy nhiều ký tự sang 1 mảng char
		// 1- vị trí bắt đâu. 2- vị trí kết thúc. 3- mảng char. 4- vị trí bắt đầu trông mảng 
		char c[] = new char[10] ;
		s.getChars(3, 6, c, 0);
		System.out.print("chuổi dc lấy ra từ 3>6 là: ");
 		System.out.println( c);
 		//getBytes lấy ra các ký tự thành 1 mảng
 		byte[] b = s.getBytes();
 		for(byte i : b) {
 			System.out.print(i+", "); 		}
 		System.out.println();
 		//
 		System.out.println(s.hashCode());
	}
}
