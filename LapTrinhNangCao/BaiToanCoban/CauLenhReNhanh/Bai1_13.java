package CauLenhReNhanh;


//Cho năm dương lịch n. Xác định năm âm lịch tương ứng. Ví dụ: 1998 là năm Mậu Dần.
public class Bai1_13 {
	public static String  NamDuongLichThanhAmLich(int year) {
		String res = "";
		year = year - 3;
		// thiên can
		switch(year%10){
		case 1:
			res=res+"Giáp";
			break;
		case 2:	
			res=res+"Ất";
			break;
		case 3:
			res=res+"Bính";
			break;
		case 4:
			res=res+"Đính";
			break;
		case 5:
			res=res+"Mậu";
			break;
		case 6:
			res=res+"Kỷ";
			break;
		case 7:
			res=res+"Canh";
			break;
		case 8:
			res=res+"Tân";
			break;
		case 9:
			res=res+"Nhâm";
			break;
		case 0:
			res=res+"Quý";
			break;
		}
		// Địa chi
		switch(year%12){
		case 1:
			res=res+" Tý";
			break;
		case 2:	
			res=res+" Sữu";
			break;
		case 3:
			res=res+" Dần";
			break;
		case 4:
			res=res+" Mão";
			break;
		case 5:
			res=res+" Thìn";
			break;
		case 6:
			res=res+" Tỵ";
			break;
		case 7:
			res=res+" Ngọ";
			break;
		case 8:
			res=res+" Mùi";
			break;
		case 9:
			res=res+" Thân";
			break;
		case 10:
			res=res+" Dậu";
			break;
		case 11:
			res=res+"Tuất";
			break;
		case 0:
			res=res+"Hợi";
			break;
		}
		
		return res;
	}
	public static void main(String[] args) {
		int year = 2022;
		String namAm = NamDuongLichThanhAmLich(year);
		System.out.println(" năm: "+year+" là năm "+namAm);
	}
}
