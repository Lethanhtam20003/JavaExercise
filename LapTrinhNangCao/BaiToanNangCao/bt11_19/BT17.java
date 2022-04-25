package bt11_19;
/**
 * Bài Tập 17.	Trong các số tự nhiên <=100, đếm xem có bao nhiêu số 
•	Chia hết cho 5
•	Chia cho 5 dư 1
•	Chia cho 5 dư 2
•	Chia cho 5 dư 3
•	Chia cho 5 dư 4

 * @author lethanhtam
 *
 */
public class BT17 {
	public static int[] SoChiaHet() {
		int[] arrResoft= new int[5];
		for(int i =0;i<=100;i++) {
			if(i%5==0) {
				arrResoft[0]++;
			}else if(i%5==1) { 
				arrResoft[1]++;
			}else if(i%5==2) {
				arrResoft[2]++;
			}else if(i%5==3) {
				arrResoft[3]++;
			} else {
				arrResoft[4]++;
			}
		}
		return arrResoft;
	}
	public static void main(String[] args) {
		int[] arr = SoChiaHet();
		System.out.println(" so chia het cho 5 :"+arr[0]);
		System.out.println(" so chia het cho 5 du 1 :"+arr[1]);
		System.out.println(" so chia het cho 5 du 2 :"+arr[2]);
		System.out.println(" so chia het cho 5 du 3 :"+arr[3]);
		System.out.println(" so chia het cho 5 du 4 :"+arr[4]);
	}
}
