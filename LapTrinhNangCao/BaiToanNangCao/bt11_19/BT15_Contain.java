package bt11_19;

import java.util.Arrays;

/**
 * Cho trước 2 mảng số nguyên bất kỳ intArr1 và intArr2. Viết hàm xác định mảng
 * thứ nhất (intArr1) có chứa mảng thứ 2 (intArr2) hay không.
 * 
 * @author lethanhtam
 *
 */
public class BT15_Contain {
	public static boolean CheckArr(int[] arrInput, int[] arrCopy) {
		boolean resoft = true;
		for (int i = 0; i < arrCopy.length; i++) {
			if (arrInput[i] != arrCopy[i]) {
				resoft = false;
				break;
			}
		}
		return resoft;
	}

	/**
	 * kiểm tra vị trí đâu tiên của arrSmall ở vị trí nào trông mảng arrlarge rồi từ
	 * vị trí đó duyệt xem các phần tử tiếp thao có giá trị thuộc arrSmall nếu đúng
	 * rồi thì ko duyệt nửa trả về kết quả nếu chưa thì tiếp tục duyệt phần tử đầu
	 * 
	 * @param arrLarge
	 * @param arrSmall
	 * @return
	 */
	public static boolean belong1(int[] arrLarge, int[] arrSmall) {
		boolean resoft = false;
		for (int i = 0; i <= (arrLarge.length - arrSmall.length); i++) {
			if (arrLarge[i] == arrSmall[0]) {
				int[] arrCopy = new int[arrSmall.length];
				System.arraycopy(arrLarge, i, arrCopy, 0, arrSmall.length);
				resoft = CheckArr(arrSmall, arrCopy);
				break;
			}
		}
		if (resoft == true) {
			System.out.println(" mang arrSmall co thuoc trong arrLarge");
		}
		return resoft;
	}

	/**
	 * lấy từng phần nhở có đọ dài length = length của arrSmall
	 * kiểm tra xem có  thuộc   hay ko
	 * @param arrLarge
	 * @param arrSmall
	 * @return
	 */
	public static boolean belong2(int[] arrLarge, int[] arrSmall) {
		boolean resoft = false;
		for (int i = 0; i <= (arrLarge.length - arrSmall.length); i++) {
			int[] arrCopy = new int[arrSmall.length];
			System.arraycopy(arrLarge, i, arrCopy, 0, arrSmall.length);
			if (CheckArr(arrSmall, arrCopy) == true) {
				resoft = CheckArr(arrSmall, arrCopy);
				break;
			}
		}
		return resoft;
	}

	public static void main(String[] args) {

		int[] arrLarge = { 1, 4, 6, 8, 2, 5, 6 };
		int[] arrSmall = { 5, 6 };
		boolean belong = belong1(arrLarge, arrSmall);
		System.out.println(belong);
	}
}
