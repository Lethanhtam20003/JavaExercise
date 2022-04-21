package bt1_9;

public class BT4 {

	public static boolean PrimeCheck(int i) {
		if (i < 2)
			return false;
		if (i < 4)
			return true;
		int count = 0;
		for (int a = 1; a <= i; a++) {
			if (i % a == 0)
				count++;
		}
		return count < 3;
	}
	
	public static int[] prime(int a, int b) {
		int[] arr = new int[b]; int i =0;
		while(true) {
			if(PrimeCheck(a)) {arr[i] =a;i++;}
			a++; 
			if(i==b) {break;}
		}
		return arr;
	}

	public static void opMaxtrix(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t , \t");
		}
	}

	public static void main(String[] args) {
		System.out.print("cac so nguyen to :");
		opMaxtrix(prime(15,5));
		
	}
}
