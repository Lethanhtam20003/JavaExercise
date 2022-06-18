package bt1_9;

public class Bt5 {
	/**
	 * viết hàm void printMatrix(int[][] matrix) hiển thị lên console mảng 2 chiều
	 * bất kỳ
	 * 
	 * @param diagonalValues
	 */
	public static void printMaxtrix(int[][] diagonalValues) {
		for (int i = 0; diagonalValues.length > i; i++) {
			for (int j = 0; j < diagonalValues[i].length; j++) {
				System.out.print(diagonalValues[i][j] + ", \t");
			}
			System.out.println();
		}
	}

	/**
	 * b. viết hàm int[][] createPascalTriangle(int size) tạo ra ma trận số nguyên 2
	 * chiều thể hiện tam giác pascal 1 1 2 3 1 2 3 4
	 * 
	 * @param diagonalValues
	 */

	public static int[][] createPascaltriangle(int n) {
		int[][] arr = new int[n][];
		for (int col = 0; arr.length > col; col++) {
			int[] arrRow = new int[col + 1];
			for (int row = 0; row <= col; row++) {
				arrRow[row] = row + 1;
			}
			arr[col] = arrRow;
		}
		return arr;
	}

	/**
	 * c. viết hàm int[][] createPascalTriangle(int[] diagonalValues) nhận vào mảng
	 * số nguyên bất kỳ chứa các giá trị năm trên đường chéo để tạo ra ma trận số
	 * nguyên 2 chiều thể hiện tam giác pascal: - Số dòng = số phần tử trong mảng
	 * diagonalValues - Giá trị các phần tử trong mảng diagonalValues giá trị của
	 * các phần tử nằm trên đường chéo của ma trận - Trên mỗi dòng giá của 1 cột
	 * bằng giá trị cột trước đó + 1 Ví dụ: input = {1, 5, 2, 0} output: 1 4 5 0 1 2
	 * -3 -2 -1 0
	 * 
	 * @param diagonnalues
	 * @return
	 */
	public static int[][] createPascaltriangle(int[] diagonnalues) {
		int[][] arr = new int[diagonnalues.length][];
		for (int col = 0; arr.length > col; col++) {
			int[] arrRow = new int[col + 1];
			for (int row = 0; row <= col; row++) {
				if (col == row) {
					arrRow[row] = diagonnalues[col];
				} else {
					arrRow[row] = diagonnalues[col] - col + row;
				}

			}
			arr[col] = arrRow;
		}

		return arr;
	}

	public static void main(String[] args) {
		System.out.println("cau b");
		printMaxtrix(createPascaltriangle(5));
		System.out.println("cau c");
		int[] b = { 1, 5, 2, 0 };
		printMaxtrix(createPascaltriangle(b));
	}
}
