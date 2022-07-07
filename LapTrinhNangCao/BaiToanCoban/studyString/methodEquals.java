package studyString;

public class methodEquals {
	public static void main(String[] args) {
		String s1 = "hehehe";
		String s2 = "HeHeHe";
		String s3 = "hehehe";
		System.out.println(s1+"\n"+s2+"\n"+s3);
		//equals so sanh hai chuổi
		System.out.println("chuổi s1 so sánh với s2: "+s1.equals(s2)+", chuổi s1 so sánh với s3  "+s1.equals(s3));
		//equalsIgnoreCase so sanh hai chuổi mà ko quang tâm viết hoa hay thường
		System.out.println("chuổi s1 so sánh với s2: "+s1.equalsIgnoreCase(s2)+", chuổi s1 so sánh với s3  "+s1.equalsIgnoreCase(s3));
		// compareTo so sánh hai chuổi có bằng nhau ko trả về 1 số bất kỳ
		// có thể âm, đương hoặc bằng 0 
		System.out.println("chuổi s1 so sánh với s2: "+s1.compareTo(s2)+", chuổi s1 so sánh với s3  "+s1.compareTo(s3));
		// compareToIgnorecase cung giống với compareTo chỉ là ko phân biệt hoa thường
		System.out.println("chuổi s1 so sánh với s2: "+s1.compareToIgnoreCase(s2)+", chuổi s1 so sánh với s3  "+s1.compareToIgnoreCase(s3));
		// regionMatches so sánh 1 đoạn 
		//1- vị trí bạn đầu 2- chuổi cần so sánh 3- vị trí bắt đâu 4- số ký tự cần so sánh
		System.out.println("so sánh s1 với đoạn \"he\" : "+s1.regionMatches(0, "he", 0, 2));
		// StartWith: so sáng chuổi bắt đâu && and endWith so sánh chuổi kết thúc
		System.out.println("s1 co băt đầu bới he k:"+s1.startsWith("he"));
		System.out.println("s1 có kết thúc với he ko: "+s2.endsWith("he"));
	}
}
