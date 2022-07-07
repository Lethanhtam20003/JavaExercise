package studyString;

public class methodIndexAndchange {
	public static void main(String[] args) {
		String s = "hello! hi! nice to meet you, uhm hi!";
		String s2 = "nice to meet you too";
		//indexOf xem vị trí của chuổi nhập vào nằm vị trí nào trông chuổi chính(kiểm tra từ trái sang phải)
		System.out.println("vị trí của từ hi! "+s.indexOf("hi!"));
		//lastIndexOf như hàm indexOf nhung kiểm tra từ ohair sang trái
		System.out.println("vị trí của từ hi! "+s.lastIndexOf("hi!"));
		// concat dung để nối chuổi
		System.out.println(s.concat(s2));
		//replace đê thay thế chuổi
		System.out.println(s.replace("hi!","hello"));
		//toLowerCase viết thường chuổi 
		System.out.println(s.toLowerCase());
		//toUpperCase viết hoa chuổi
		System.out.println(s.toUpperCase());
		//trim xóa bỏ khoảng trắng thừa ở trước và sau mỗi chữ chỉ trừa lại 1khoangr trắng cần thiết 
		System.out.println(s.trim());
		//tocharArray biết đổi chuổi thàng 1 mảng ký tựx
		char[] a = s.toCharArray();
		for(char i : a) System.out.print(i+",");
		System.out.println();
		//subString hàm cắt chuổi
		System.out.println(s.substring(11));
	}
}
