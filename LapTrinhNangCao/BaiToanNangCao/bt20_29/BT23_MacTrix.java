package bt20_29;

import java.util.Random;

/**
 * Bài Tập 23. Bài tập về ma trận: ma trận tam giác, cộng, nhân ma trận
 * 
 * @author lethanhtam
 *
 */
public class BT23_MacTrix {
	public BT23_MacTrix() {
		// TODO Auto-generated constructor stub
	}

	public void triangleMatrix(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row <= col; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * cộng hai ma trận 2 ma trận phải = kích thước
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int[][] plusMatrix(int[][] a, int[][] b) {
		if (checkArrEqualsForPlusMatrix(a, b)) {

			for (int col = 0; col < a.length; col++) {
				for (int row = 0; row < a[col].length; row++) {
					a[col][row] += b[col][row];
				}
			}
			return a;
		} else {
			return null;
		}
	}

	private boolean checkArrEqualsForPlusMatrix(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		return a.length == b.length && a[0].length == b[0].length;
	}

	public int[][] matrixMultiplication(int[][] a, int[][] b) {
		if (a.length == b[0].length) {

			int[][] res = new int[a.length][b[0].length];
			for (int col = 0; col < res.length; col++) {
				for (int row = 0, sum = 0; row < res[col].length; row++) {
					for (int i = 0; i < a.length; i++) {
						sum += a[col][i] + b[i][row];
					}
					res[col][row] = sum;
				}
			}

			return res;
		} else {
			return null;
		}
	}

	public void display(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr[col].length; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}
	}

	public int[][] createMatrixRandom(int indexA, int indexB) {
		int[][] arrResult = new int[indexA][indexB];
		Random rd = new Random();
		for (int col = 0; col < indexA; col++) {
			for (int row = 0; row < indexB; row++) {
				arrResult[col][row] = (int) rd.nextInt(0, 10);
			}
		}
		return arrResult;
	}

	public static void main(String[] args) {
		BT23_MacTrix bt = new BT23_MacTrix();
		System.out.println("triangle Matrix \n");
		bt.triangleMatrix(bt.createMatrixRandom(4, 4));
		System.out.println("create random maxtrix \n");
		bt.display(bt.createMatrixRandom(5, 5));

		System.out.println("\n check plus");
		//check plus matrix
		// first check 
		try {
			
		int[][] arr1 = bt.createMatrixRandom(4, 3);
		int[][] arr2 = bt.createMatrixRandom(4, 3);
		System.out.println("plus two maxtrix (first check)\n");
		System.out.println("maxtrix 1");
		bt.display(arr1);
		System.out.println("matrix 2");
		bt.display(arr2);
		System.out.println("result:");
		bt.display(bt.plusMatrix(arr1, arr2));
		System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
		// second check
		try {
		int[][] arr1 = bt.createMatrixRandom(4, 8);
		int[][] arr2 = bt.createMatrixRandom(4, 3);
		System.out.println("plus two maxtrix (second check)\n");
		System.out.println("maxtrix 1");
		bt.display(arr1);
		System.out.println("matrix 2");
		bt.display(arr2);
		System.out.println("result:");
		bt.display(bt.plusMatrix(arr1, arr2));
		}catch(NullPointerException e){
			System.out.println("both of matrix not equas!");
//			e.printStackTrace();
		}
		System.out.println("\n check multip");
		/**
		 * check multip
		 */
		try {
		int[][] arr1 = bt.createMatrixRandom(5, 7);
		int[][] arr2 = bt.createMatrixRandom(7,5);
		bt.display( bt.matrixMultiplication(arr1, arr2));
		}catch(NullPointerException e) {
			System.out.println("both of matrix dont multiplus because the length dont equals");
		}
		
	}
}
