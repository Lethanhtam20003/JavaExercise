package ThiGiuaKyD2;

import java.util.Arrays;

/**
 * cho n số và số x. loại bỏ khỏi dãy các phần tử bằng x. in cả hai dãy ra màn
 * hình
 * 
 * @author lethanhtam
 *
 */

public class cau2 {
	//cach 1
	static public int[] bt(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				a = bt2(a, i);
				i--;
			}
		}

		return a;
	}

	private static int[] bt2(int[] a, int i) {
		int[] res1 = new int[i];

		int[] res2 = new int[a.length - i - 1];
		System.arraycopy(a, 0, res1, 0, i);
		System.arraycopy(a, i + 1, res2, 0, a.length - i - 1);
		int[] res = new int[res1.length + res2.length];
		System.arraycopy(res1, 0, res, 0, res1.length);
		System.arraycopy(res2, 0, res, res1.length, res2.length);

		return res;
	}
	//cach 2
	public static int[] removeValue(int[] arr, int x) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != x) {
				arr[count++] = arr[i];
			}
		}
		int[] newArr = new int[count];
		System.arraycopy(arr, 0, newArr, 0, count);
		return newArr;
	}
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 4, 5, 66, 4, 4, 7, 8, 8 };
		int[] res = bt(arr, 4);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		for (int i : res) {
			System.out.print(i + "\t");
		}
		System.out.println();
		int[] arr2 = new int[] {2,1,3,1,1,1,4,5,6,7,1,8,9};
		System.out.println(Arrays.toString(removeValue(arr2, 1)));
	}
}
