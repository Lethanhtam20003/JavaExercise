package bt11_19;

import bt1_9.BT9;

/**
 * Bài Tập 10.	(4) Cho 1 mảng số nguyên bất kỳ arr và 1 số nguyên bất ký qty (qty < kích thước mảng arr) 
 * viết phương thức trả về mạng số nguyên có qty phần tử 
 * lấy ngẫu nhiên từ mảng arr public int[] subArray(int[] arr, int qty) 

 * @author lethanhtam
 *
 */
public class BT_10 {
	BT9 bt = new BT9();
	public static int[] subArray(int[] arr, int qty) {
		int[] resoft = new int[qty];
		int random;
		for (int i =0;resoft.length >i;i++){
			random = (int)Math.ceil(Math.random()*100);
			while(random>=arr.length) {
				random = (int)Math.ceil(Math.random()*10);
			}
			resoft[i] = arr[random];
		}
		return resoft;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,12,43,5,0};
		BT9.printArray(subArray(arr, 6));
	}
}
