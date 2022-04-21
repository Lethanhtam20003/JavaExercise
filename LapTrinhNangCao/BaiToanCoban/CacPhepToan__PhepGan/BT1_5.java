package CacPhepToan__PhepGan;

import java.util.Scanner;

public class BT1_5 {
	public static void main(String[] args) {
		int[] a = new int[2];
		int[] b = new int[2];
		Scanner ip = new Scanner(System.in);
		while(true) {
			int i=0;
		System.out.print("nhập vào xA: ");
		a[i] = ip.nextInt();
		System.out.print("\n nhập vào xB: ");
		b[i] = ip.nextInt();
		i =1;
		System.out.print("\n nhập vào yA: ");
		a[i] = ip.nextInt();
		System.out.print("\n nhập vào yB: ");
		b[i] = ip.nextInt();
		System.out.println(" khoảng cách: "+calculateDistance(a, b)+"\n");
		}
		
	}

	private static double calculateDistance(int[] a,int [] b) {
		// TODO Auto-generated method stub
		return Math.sqrt((a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]));
	}
	
	
}
