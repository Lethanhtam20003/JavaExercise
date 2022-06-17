package ThiGiuaKyD1;

/**
 * cho ma trận các số nguyên kích thước nxn a- in ma trận ra man hình b- kiểm
 * tra ma trận có đối xứng qua đường chéo chính hay ko
 * 
 * @author lethanhtam
 *
 */
public class cau3 {
	static public void displayMatrix(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println("\n");
		}
	}

	static public boolean isDoiSung(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr.length; row++) {
				if (arr[col][row] != arr[row][col])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int [][] arr = {
				{11,12,13,14},
				{12,22,23,24},
				{13,23,33,34},
				{14,24,34,44}
		};
		displayMatrix(arr);
		System.out.println((isDoiSung(arr))?("doi xung"):"ko doi xung" );
	
	}
}
