package bt11_19;

import java.util.StringTokenizer;

/**
 * Bài Tập 1. (4) Viết chương trình nhận vào ngày tháng theo định dạng
 * “21/12/2000”, sau đó in ra theo định dạng 21 December 2000
 * 
 * @author lethanhtam
 *
 */
public class BT11 {
	// sư dung indexOf
	static public String dinhDangNgayThang(String date) {
		String res = "";
		String dayStr, monStr, yearStr;
		int mon;
		dayStr = date.substring(0, date.indexOf('/'));
		monStr = date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'));
		yearStr = date.substring(date.lastIndexOf('/') + 1);
		mon = Integer.parseInt(monStr);
		res += "ngay " + dayStr + " thang ";
		switch (mon) {
		case 1:
			res += " January ";
			break;
		case 2:
			res += " February ";
			break;
		case 3:
			res += " March ";
			break;
		case 4:
			res += " April ";
			break;
		case 5:
			res += " May ";
			break;
		case 6:
			res += " June ";
			break;
		case 7:
			res += " July ";
			break;
		case 8:
			res += " August ";
			break;
		case 9:
			res += " September ";
			break;
		case 10:
			res += " October ";
			break;
		case 11:
			res += " November ";
			break;
		case 12:
			res += " December(12) ";
			break;
		}
		res += " nam " + yearStr;
		return res;
	}

//	//sư dung slip
//	public static String DinhDangNgayThang2(String date) {
//		String res = "";
//		String dayStr, monStr, yearStr;
//		String[] sd = date.split('\');
//		
//		return res;
//	}

	// sử dụng to Token
	public static String DinhDangNgayThang3(String date) {
		String res = "";
		String dayStr, monStr, yearStr;
		StringTokenizer ngay = new StringTokenizer(date, "/");
		dayStr = ngay.nextToken();
		monStr = ngay.nextToken();
		yearStr = ngay.nextToken();
		int mon = Integer.parseInt(monStr);
		res += "ngay " + dayStr + " thang ";
		switch (mon) {
		case 1:
			res += " January ";
			break;
		case 2:
			res += " February ";
			break;
		case 3:
			res += " March ";
			break;
		case 4:
			res += " April ";
			break;
		case 5:
			res += " May ";
			break;
		case 6:
			res += " June ";
			break;
		case 7:
			res += " July ";
			break;
		case 8:
			res += " August ";
			break;
		case 9:
			res += " September ";
			break;
		case 10:
			res += " October ";
			break;
		case 11:
			res += " November ";
			break;
		case 12:
			res += " December(12) ";
			break;
		}
		res += " nam " + yearStr;
		return res;
	}

	public static void main(String[] args) {
		String date = "23/12/3344";
		System.out.println(DinhDangNgayThang3(date));
	}
}
