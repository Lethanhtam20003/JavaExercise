package ThiGiuaKyD2;

import java.util.Arrays;

/**
 * cho ma trận các số nguyên kích thước mxn
 * a- in ma trận ra man hình
 * b- tính tổng từng dòng của ma trận và tìm dòng có tổng lớn nhất
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

	static public int[] isSumRow(int[][] arr) {
		int[] res=new int[arr[0].length];
		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr.length; row++) {
				res[col]+=arr[col][row];
			}
		}
		return res;
	}
	static public int isMaxSumRow(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int [][] arr = {
				{11,12,13,14},
				{12,22,23,24},
				{13,23,33,34},
				{14,24,34,44}
		};
		displayMatrix(arr);
		System.out.println(Arrays.toString(isSumRow(arr)) );
		int index = 0;
		for(int i : isSumRow(arr)){
			System.out.println("valu of row "+index+" is:"+i);
			index++;
		}
		System.out.println("max value of row in arr is:"+ isMaxSumRow(isSumRow(arr)));
	
	}
}
