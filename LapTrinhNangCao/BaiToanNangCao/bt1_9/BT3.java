package bt1_9;

//import java.util.Iterator;

public class BT3 {
//	public static int[] creMaxtrix(int i) {
//		int[] arr = new int[i];
//		for(int a=0;i>a ;a++) {
//			arr[a] = (int) Math.ceil( Math.random() *100) ;
//		}
//		return arr;
//	}
	
	public static int[] arrayPlus( int[] arr1, int[] arr2) {
		int[] arrmax,arrmin ;
		if(arr1.length >= arr2.length) {
			arrmax = arr1;arrmin = arr2;
		}else {
			arrmax = arr2;arrmin = arr1;  
		}
		int i = arrmax.length; int a=1;
		while(i>0 ) {
			if(a> arrmin.length) {
				arrmax[arrmax.length-a] = arrmax[arrmax.length-a] ;
				i--; a++;
			}else {
				
			arrmax[arrmax.length-a] +=  arrmin[arrmin.length-a];
			i--; a++;
			}
		}
		return	 arrmax;
	}
	
//	public static void opMaxtrix(int[] arr) {
//		for(int i = 0;arr.length>i;i++) {
//			System.out.print(arr[i] +"\t");
//		}
//	}
	public static void opMaxtrix(int[] arr) {
		for(int i: arr) {
			System.out.print(i+"\t , \t");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1,9,3,33};
		int[] arr2 = {8,8,0,67};
		System.out.println("arr1:");
		opMaxtrix(arr1);
		System.out.println("\n"+"arr2:");
		opMaxtrix(arr2);
		System.out.println("\n arr:");
		opMaxtrix(arrayPlus(arr1, arr2));
	}
}
