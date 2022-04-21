package bt11_19;

import java.util.Scanner;

/**
 * Bài Tập 1. (4) Viết chương trình nhận vào ngày tháng theo định dạng
 * “21/12/2000”, sau đó in ra theo định dạng 21 December 2000
 * 
 * @author lethanhtam
 *
 */
public class BT11 {
	static public String dinhDangNgayThang(int day,int month,int year) {
		String res = "";
		if(day >=31 || month>=12 ) {
			
			return "nhap sai ngay thang";
		}
		res += day;
		
		switch(month) {
		case 1:
			res+=" January ";
			break;
		case 2:
			res+=" February ";
			break;
		case 3:
			res+=" March ";
			break;
		case 4:
			res+=" April ";
			break;
		case 5:
			res+=" May ";
			break;
		case 6:
			res+=" June ";
			break;
		case 7:
			res+=" July " ;
			break;
		case 8:
			res+=" August ";
			break;
		case 9:
			res+=" September ";
			break;
		case 10:
			res+=" October ";
			break;
		case 11:
			res+=" November ";
			break;
		case 12:
			res+=" December ";
			break;
		}
		res+=year;
		return res;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print(" Nhap ngay thang:");
		int day = ip.nextInt();
		System.out.print("\n Nhap ngay thang:");
		int month = ip.nextInt();
		System.out.print("\n Nhap ngay thang:");
		int year = ip.nextInt();
		System.out.println("ngay thang nhap vao: "+day+" / "+month+" / "+year);
		System.out.println("sau khi dinh dang: "+dinhDangNgayThang(day, month, year));
	}
}
