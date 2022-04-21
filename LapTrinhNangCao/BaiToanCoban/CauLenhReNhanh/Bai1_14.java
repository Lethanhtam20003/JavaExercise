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
				StrArr[i] = "một ";
				break;
			case 2:
				StrArr[i] = "hai ";
				break;
			case 3:
				StrArr[i] = "ba ";
				break;
			case 4:
				StrArr[i] = "bốn ";
				break;
			case 5:
				StrArr[i] = "năm ";
				break;
			case 6:
				StrArr[i] = "sáu ";
				break;
			case 7:
				StrArr[i] = "bảy ";
				break;
			case 8:
				StrArr[i] = "tám ";
				break;
			case 9:
				StrArr[i] = "chín ";
				break;
			case 0:
				StrArr[i] = "";
				break;
			}
			i++;
		}
		for (i=0; i!=count;i++) {
			if (i == count - 3) {
				res =res+StrArr[i] + "trăm ";
			}
			
			if (i == count - 2) {
				if(StrArr[i]=="") {
					res =res+  "lẽ ";
				}else {
					res =res+ StrArr[i] + "mươi ";
				} 
			}
			
			
			if (i == count - 1) {
				if(StrArr[i] =="năm ") {
					StrArr[i]="lăm ";
				}
				res =res + StrArr[i] + " ";
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int number = 607;
		System.out.println(SoThanhChu(number));
	}
}
