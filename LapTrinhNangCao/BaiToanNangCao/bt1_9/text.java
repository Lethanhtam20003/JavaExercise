package bt1_9;

/**
 * Bài Tập 9. (4) Cho mảng số nguyên bất kỳ. Viết hàm xắp xếp từ lớn tới nhỏ và
 * ngước lại (tự viết giải thuật xắp xếp và dùng List)
 * 
 * @author lethanhtam
 *
 */

public class text {
	//tạo arr với số ngẫu nhiên
	static public int[] createAnyArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; n > i; i++) {
			arr[i] = (int) Math.ceil(Math.random() * 100);
		}
		return arr;
	}

	// in mảng ra màn hình
	static public void printArray(int[] arr) {
		for (int i = 0; arr.length > i; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	// săp xếp từ nhỏ đến lớn
	static public int[] softFromSmallToLarge(int[] arr) {
		int[] resoft = new int[arr.length];
		for (int i = 0; arr.length > i; i++) {

			int min = arr[i];
			for (int j = i + 1; arr.length > j; j++) {
				if (arr[j] < min)
					min = arr[j];
			}

			for (int j = i; arr.length > j; j++) {
				if (min == arr[j]) {
					arr[j] = arr[i];
					break;
				}
			}
			resoft[i] = min;
		}
		return resoft;

	}

	// xắp xếp từ lơn đến nhỏ
	static public int[] softFromLargeToSmall(int[] arr) {
		int[] resoft = new int[arr.length];
		for (int i = 0; arr.length > i; i++) {

			int max = arr[i];
			for (int j = i + 1; arr.length > j; j++) {
				if (arr[j] > max)
					max = arr[j];
			}
			for (int j = i; arr.length > j; j++) {
				if (max == arr[j]) {
					arr[j] = arr[i];
				}
			}
			resoft[i] = max;
		}
		return resoft;
	}

	public static void main(String[] args) {
//			System.out.println("softFromSmallToLarge \n");
//			printArray(softFromSmallToLarge(createAnyArray(10)));
//			System.out.println("\n softFromLargeToSmall");
//			printArray(softFromLargeToSmall(createAnyArray(10)));
		int[] a = { 3, 5000, 0, 4, -7, 10, 0, 55 };
		int[] b = { 3, 5000, 7, 4, -7, 10, 9, 55 };
		System.out.println("\n lớn đến nhỏ");
		printArray(softFromLargeToSmall(a));
		System.out.println();
		
		System.out.println("\n b \n");
		printArray(softFromSmallToLarge(b));
		System.out.println("\n nhỏ đến lớn");
		printArray(softFromSmallToLarge(a));
	}
}
