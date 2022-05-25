package bt11_19;

import bt1_9.BT9;
/**
 * Bài Tập 10.	(4) Cho 1 mảng số nguyên bất kỳ arr và 1 số nguyên bất ký qty (qty < kích thước mảng arr) 
 * viết phương thức trả về mạng số nguyên có qty phần tử 
 * lấy ngẫu nhiên từ mảng arr public int[] subArray(int[] arr, int qty) 

 * @author lethanhtam
 *
 */
public class BT_10_TaoMangNhoHon {
	BT9 bt = new BT9();
	/**
	 * SubMethod for subArrayC1
	 * @param arrCheak
	 * @param number
	 * @return
	 */
	static public boolean CheakEquals(int[] arrCheak,int number) {
		boolean res = false;
		for(int i=0;arrCheak.length > i;i++) {
			if(arrCheak[i] == number) {
				res= true;
			}
		}
		
		return res;
	}
	/**
	 * SubMethod for subArrayC1
	 * @param a
	 * @param b
	 * @return
	 */
	static public boolean TwoCondition(boolean a, boolean b) {
		boolean res = true;
		if(a==true && b==true) {
			res = true;
		}else if(a==false && b==true || a==true && b==false){
			res = true;
		}else {
			res=false;
		}
		return res;
	}
	
	/**
	 * cách làm này sai 
	 * khi chạy các chương trình lớn sẽ dẽ tạo ra 1 vông random vô hạn
	 * 
	 * thuật toán là cho random vị trí 
	 * số random nào nhỏ hơn số vị trí trông mảng và ko có vị trí trùng thì in vào mảng result
	 * @param arr
	 * @param qty
	 * @return
	 */
	public static int[] subArrayC1(int[] arr, int qty) {
		int[] resoft = new int[qty];
		int random;
		int[] arrCheak = new int[arr.length];
		boolean a,b,Condition;
		for (int i =0;resoft.length >i;i++){
			random = (int)Math.ceil(Math.random()*100);
			 a = CheakEquals(arrCheak, random);
			 b = random>=arr.length;
			Condition = TwoCondition(a, b);
			while( Condition ) {
				random = (int)Math.ceil(Math.random()*10);
				a = CheakEquals(arrCheak, random);
				b = random>=arr.length;
				Condition = TwoCondition(a, b);
			}
			System.out.println("random : "+random);
			arrCheak[i]=random;
			resoft[i] = arr[random];
			System.out.println("arr : "+arr[random]);
			System.out.println();
		}
		return resoft;
	}
	/**
	 * thuật toán: từ mảng ban đầu xáo trộn và copy số phần tử qty vào mảng kết quả
	 * @param arr
	 * @param qty
	 * @return
	 */
	public static int[] subArrayC2(int[] arr, int qty) {
		int[] resoft = new int[qty];
		int limit = limit(arr.length);
		int cache;
		/*
		 * phần xáo trộn array
		 */
		for(int i = 0; arr.length>i;i++) {
			int random = (int)Math.ceil(Math.random()*limit);
			while(random >= arr.length ) {
				random = (int)Math.ceil(Math.random()*limit);
			}
			cache=arr[i];
			arr[i]=arr[random];
			arr[random]=cache;
		}
		
		//hàm copy array 
		 System.arraycopy(arr, 0, resoft, 0, qty);
		return resoft;
	}
	private static int limit(int length) {
		// TODO Auto-generated method stub
		int res=1;
		while(length>=res) {
			res=res*10;
		}
		return res;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		BT9.printArray(subArrayC2(arr, 3));
	}
}
