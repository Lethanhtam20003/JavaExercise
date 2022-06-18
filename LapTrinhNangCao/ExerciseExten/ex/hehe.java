package ex;

public class hehe {
	static public void printMaxtrix(int[][] arr) {
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row <= col; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}
	}

	static public int[][] createPascalTriangle(int size) {
		int[][] arr = new int[size][size];
		for (int col = 0; col < size; col++) {
			for (int row = 0; row <= col; row++) {
				arr[col][row] = row+1;
			}
		}
		return arr;
	}

	static public int[][] createPascalTriangle(int[] diagonalValue) {
		int[][] arr = new int[diagonalValue.length][diagonalValue.length];
		for (int col = 0; col < diagonalValue.length; col++) {
			for (int row = 0; row <= col; row++) {
				if (col == row) {
					arr[col][row] = diagonalValue[col];
				}
				arr[col][row] = diagonalValue[col] - col + row;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = {4,5,7,-3};
		printMaxtrix(createPascalTriangle( 9 ));
		printMaxtrix(createPascalTriangle( a ));
		
	}
}
