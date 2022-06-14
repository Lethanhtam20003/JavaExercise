package bt20_29;

public class BT24_Arraylsit {
	public BT24_Arraylsit() {
		// TODO Auto-generated constructor stub
	}

	public int maxValueInArr(int[] array) {
		int max = array[1];
		for (int index : array) {
			max = (max < index) ? index : max;
		}
		return max;
	}

	public int minValueInArr(int[] array) {
		int min = array[1];
		for (int index : array) {
			min = (min >= index) ? index : min;
		}
		return min;
	}

	public int indexOfMaxValule(int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (maxValueInArr(array) == array[index]) {
				return index;
			}
		}
		return -1;
	}

	public int sumMaxValule(int[] array) {
		int count = 0;
		int max = maxValueInArr(array);
		for (int index = 0; index < array.length; index++) {
			if (max == array[index]) {
				count++;
			}
		}
		return count * max;
	}

	public static void main(String[] args) {
		BT24_Arraylsit bt = new BT24_Arraylsit();
		int[] arr = { 3, 5, 6, 7, 9, 9, 4, 7, 9, 0 };
		System.out.println(bt.maxValueInArr(arr));
		System.out.println(bt.minValueInArr(arr));
		System.out.println(bt.indexOfMaxValule(arr));
		System.out.println(bt.sumMaxValule(arr));

		int[] arr2 = { 3, 5, 6 };
		System.out.println(bt.maxValueInArr(arr2));
		System.out.println(bt.minValueInArr(arr2));
		System.out.println(bt.indexOfMaxValule(arr2));
		System.out.println(bt.sumMaxValule(arr2));

	}
}
