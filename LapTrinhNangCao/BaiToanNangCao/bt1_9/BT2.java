/**
 * 
 */
package bt1_9;

import java.util.Scanner;

/**
 * @author lethanhtam
 *
 */
public class BT2 {
	public static int countN(int number) {
		String s = String.valueOf(number);
		return s.length();
	}
	public static int countN2(int number) {
		int count=0;
		while(number != 0) {
			number = number /10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhập số vào bàn phím:");
		int number = ip.nextInt();
		System.out.println(countN(number) +" = "+ countN2(number));
	}
}
