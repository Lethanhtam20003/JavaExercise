package CauLenhReNhanh;

import java.util.Scanner;

/**
 * Cho 3 số a, b, c. Xét 3 số đó có là 3 cạnh của tam giác. Nếu đúng, thì tính
 * chu vi, diện tích, và số đo độ của các góc của tam giác.
 * 
 * @author lethanhtam
 *
 */
public class Bai1_11 {
	static public boolean ditermineTamGiac(int a,int b,int c) {
		if(a+b>=c && a+c>=b && b+c>=a && a>0 && b>0 && c>0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a =5,b=8,c=7;
		if(ditermineTamGiac(a, b, c)) {
			System.out.println("voi a= "+a+", b= "+b+", c= "+c+"\n\t => ta co dc mot tam giac");
		}else {
			System.out.println("voi a= "+a+", b= "+b+", c= "+c+"\n \t => ta khong co dc mot tam giac");
		}
	}
}
