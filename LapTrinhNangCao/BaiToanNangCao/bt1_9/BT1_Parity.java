package bt1_9;

import java.util.Scanner;

public class BT1_Parity {
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

	/**
	 * kiểm tra 1 số có phải là số nguyên tố hyay ko. prime check : kiểm tra số
	 * nguyên tố count == 2 thì sẽ là số nguyên tố (sử dụng cách đếm bao nhiêu số
	 * thỏa điều kiện chia hết) số 0 và 1 ko là số nguyên tố số 2 là số nguyên tố
	 * nhỏ nhất
	 * 
	 * @param i
	 * @return
	 */
	public static boolean PrimeCheck(int i) {
		if (i < 2)
			return false;
		if (i < 4)
			return true;
		int count = 0;
		for (int a = 1; a <= i; a++) {
			if (i % a == 0)
				count++;
		}
		return count < 3;
	}


	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("kiểm tra 1 số : \n "
				+ "nhập vào từ bàn phím số tự nhiên cho đến khi người dùng nhập số 0");
		while (true) {
			int number=ip.nextInt();
			// xác định chẵn lẽ
			if (parityCheck((int) number) == 1)
				System.out.println(number + "là số lẽ.");
			if (parityCheck((int) number) == 2)
				System.out.println(number + "là số chăn.");
			if (parityCheck((int) number) == 0) {
				System.out.println(number + "là số ko chăn ko lẽ");
			}
			// xác định số nguyễn tố 
			if (number == 0) {
				System.out.println(number + "là khong số nguyên tố");
				break;
			}
			if (PrimeCheck(number) == true)
				System.out.println(number+" là số nguyên tố.");
			if (PrimeCheck(number) == false)
				System.out.println(number + "là khong số nguyên tố.");
		}
	}
}
