/**
 * 
 */
package CacPhepToan__PhepGan;

import java.util.Scanner;

/**
 * @author lethanhtam
 *
 */
public  class BT1_4 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while(true) {
			
		System.out.print("Tính thời gian và vận tóc của vật luc chạm đất: ");
		int o = ip.nextInt();
		System.out.print(" thời gian: "+calculateTime(o)+"; vận toc: "+calculateSpeed(o)+"\n");
		if(o== 0) break;
		}
	}

	private static double calculateTime(int h) {
		// TODO Auto-generated method stub
		return Math.sqrt(2*h/9.8);
	}
	private static double calculateSpeed(int h) {
		// TODO Auto-generated method stub
		return 9.8*calculateTime(h);
	}
	
	
	
}
