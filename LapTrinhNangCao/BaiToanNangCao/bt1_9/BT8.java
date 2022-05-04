package bt1_9;

import java.util.Scanner;

/**
 * Viết một chương trình đọc vào 1 số nguyên bất kỳ : vd 1132422323, sau đó in
 * ra màn hình dưới dạng : 1,132,422,323
 * 
 * @author lethanhtam
 *
 */
public class BT8 {
	// subMethor thuộc cách 1
	public static int count(int number) {
		String s = String.valueOf(number);
		return s.length();
	}

	// cách làm 1
	static public String xuatSoCoPhay(int number) {
		String s = "";
		int count = count(number) / 3 + 1;
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = number % 1000;
			if (i == count) {
			} else {
				number = number / 1000;
			}
		}

		for (int i = 0; i < count; i++) {
			if (arr[i] == 0 && i == count - 1) {
			} else if (i == count - 1) {
				s = arr[i] + "," + s;
			} else if (arr[i] == 0) {
				s = "000," + s;
			} else if (arr[i] < 10) {
				s = "00" + arr[i] + "," + s;
			} else if (arr[i] < 100) {
				s = "0" + arr[i] + "," + s;
			} else {
				s = arr[i] + "," + s;
			}
		}

		return s.substring(0, s.length() - 1);

	}

	// cách làm 2
	static public String a(int number) {
		String res = "";
		String dem = String.valueOf(number);

		int count = count(number);
		int i = 0;
		if (count % 3 == 0) {
			res = res + dem.charAt(i);
			count--;
			i++;
		}

		while (count > 0) {
			if (count % 3 == 0) {
				res = res + "," + dem.charAt(i);
				i++;
				count--;
			}
			res = res + dem.charAt(i);
			count--;
			i++;
		}

		return res;
	}

	// subMethot thuộc cách 2
	static public int count2(int number) {
		int count;
		for (count = 0; number > 0; count++) {
			number = number / 10;
		}
		return count;
	}

	// cách 3
	static public String NumberFormat(int number) {
		String res = "";
		String numberStr = "";
		numberStr = numberStr.valueOf(number);
		int length = numberStr.length();
		int index = 0;
		if (length % 3 == 0) {
			res += numberStr.charAt(index);
			index++;
			length--;
		}
		while (length > 0) {
			if (length % 3 == 0) {
				res += "," + numberStr.charAt(index);
				index++;
				length--;
			}
			res += numberStr.charAt(index);
			index++;
			length--;
		}
		return res;
	}

	public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		System.out.print("nhap so: ");
//		int number = ip.nextInt();
//		System.out.println("count: " + count(number) + "kk: " + number);
//		System.out.println("dap an: " + a(number));
//		System.out.println(xuatSoCoPhay(1132422323));
		System.out.println(NumberFormat(1000220773));
	}

}
