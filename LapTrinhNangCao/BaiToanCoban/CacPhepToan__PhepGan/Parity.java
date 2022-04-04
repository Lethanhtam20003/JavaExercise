package CacPhepToan__PhepGan;

import java.util.Scanner;

public class Parity {
	/**
	 * kiểm tra 1 số có phải là số chẵn hay số lẽ. parity check : kiểm tra chăn lẽ 0
	 * : ko chẵn ko lẽ 1 : số lẽ 2 : số chăn
	 * 
	 * @return
	 */
	public static byte parityCheck(int i) {
		if (i == 0)
			return 0;
		if (i % 2 != 0)
			return 1;
		return 2;
	}
	
	static int number;
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("kiểm tra 1 số có phải là số chẵn hay số lẽ: \n "
				+ "nhập vào từ bàn phím số tự nhiên cho đến khi người dùng nhập số 0");
		while (true) {
			System.err.print("nhap so:"); number = ip.nextInt();
			if(parityCheck((int)number) ==1 ) System.out.println(number + "là số lẽ.");
			if(parityCheck((int)number) ==2 ) System.out.println(number + "là số chăn.");
			if (parityCheck((int)number) == 0) {
				System.out.println(number+"là số ko chăn ko lẽ");
				break;
			}
		}
	}
}
