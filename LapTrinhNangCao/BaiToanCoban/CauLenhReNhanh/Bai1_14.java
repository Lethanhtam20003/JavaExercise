package CauLenhReNhanh;

import bt1_9.BT8;

/**
 * Cho số tự nhiên n < 1000. Tính ra cách viết số đó bằng chữ. Ví dụ: 125 đọc là
 * Một trăm hai mươi lăm
 * 
 * @author lethanhtam
 *
 */
public class Bai1_14 {
	static public int[] count(int number) {
		int[] arr = new int[BT8.count2(number)];
		int i = BT8.count2(number)-1;
		int dem;
		while (number > 0) {
			dem = number % 10;
			number = number / 10;
			arr[i] = dem;
			System.out.println(arr[i]+""+i);
			i--;
		}
		return arr;
	}

	static public String SoThanhChu(int number) {
		String res = "";
		int i = 0, count = BT8.count(number);
		int[] arr = count(number);
		String[] StrArr = new String[count];
		while (i < count) {
			switch (arr[i]) {
			case 1:
				StrArr[i] = "mot ";
				break;
			case 2:
				StrArr[i] = "hai ";
				break;
			case 3:
				StrArr[i] = "ba ";
				break;
			case 4:
				StrArr[i] = "bon ";
				break;
			case 5:
				StrArr[i] = "nam ";
				break;
			case 6:
				StrArr[i] = "sau ";
				break;
			case 7:
				StrArr[i] = "bay ";
				break;
			case 8:
				StrArr[i] = "tam ";
				break;
			case 9:
				StrArr[i] = "chin ";
				break;
			case 0:
				StrArr[i] = " ";
				break;
			}
			i++;
		}
		i = 0;
		while (i!=count) {
			if (i == count - 3) {
				if(StrArr[i] =="nam ") {
					StrArr[i]="lam ";
				}
				System.out.println(i+"s");
				res =StrArr[i] + " "+res;
			}
			
			if (i == count - 2) {
				System.out.println(i+"n");
				res = StrArr[i] + "muoi "+res;
			}
			
			
			if (i == count - 1) {
				System.out.println(i+"d");
				res = StrArr[i] + "tram "+res;
			}
			i++;
		}
		return res;
	}

	public static void main(String[] args) {
		int number = 345;
		System.out.println(SoThanhChu(number));
	}
}
