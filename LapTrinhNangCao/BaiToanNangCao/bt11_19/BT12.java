package bt11_19;

import java.util.StringTokenizer;
/**
 * Lớp java.util.StringTokenizer cho phép bạn chia một chuỗi thành các token. 
 * Đây là cách đơn giản để chia chuỗi. 
 * Lớp này không cung cấp phương tiện để phân biệt các số, 
 * các chuỗi đã được trích dẫn, các định danh indentifier, … giống như lớp StreamTokenizer.
 * @author lethanhtam
 *
 */
public class BT12 {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("alibaba va 70 cay ma tau, hahh, hihi");
		/*
		 * các phương thức:
		 * hasMoreTokens() xem có nhiều token có săn ko
		 * String nextToken()	Trả về token tiếp theo từ đối tượng StringTokenizer
		 * String nextToken(String delim)	Trả về token tiếp theo dựa trên dấu phân tách delim
		 * vboolean hasMoreElements()	Giống như phương thức hasMoreTokens()
		 * Object nextElement()	Giống như nextToken() nhưng kiểu trả về của nó là Object
		 * int countTokens()	Trả về tổng số token
		 */
		System.out.println(st.nextToken(","));
		st = new StringTokenizer("alibaba va 70 cay ma tau, hahh, hihi");
		System.out.println();
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		st = new StringTokenizer("alibaba va 70 cay ma tau, hahh, hihi");
		System.out.println(st.countTokens());
	}
	
}
