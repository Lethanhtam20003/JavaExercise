package De2018_2019;

public class C1 {

	public int[][] cauA(int[] arr) {

		int[][] res = new int[arr.length][arr.length];
		int count = 0;
		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[row].length; col++) {
				
				if (col == res.length - count - 1) {
					res[row][col] = arr[count];
				} else {
					res[row][col] = arr[count] - 2 *( res.length - count - 1)+col*2;
					
				}
			}
			count++;
		}

		return res;
	}

	// ma trận có m*n (m dòng, n cột)
	public void prinlArr(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		C1 c = new C1();

		c.prinlArr(new int[5][5]);
		int[] a = { 3, 4, 6, 7 ,3,5,11,200};
		c.prinlArr(c.cauA(a));
	}
}
