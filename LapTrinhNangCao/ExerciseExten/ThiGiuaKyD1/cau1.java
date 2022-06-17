package ThiGiuaKyD1;

import java.util.ArrayList;
import java.util.List;

/**
 * cho số tự nhiên. c1 - kiểm tra số đó là số nguyên tố hay ko. c-2 phân tích n
 * ra ra các thừa số nguyên tố
 * 
 * @author lethanhtam
 *
 */
public class cau1 {


	//
	public static boolean isPrime(int num) {
		if(num<2) return false;
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) 
				count++;			 
		}
		return count<3;
	}
	
	public static List<Integer> analysisNumber(int num) {
		List<Integer> listNumbers = new ArrayList<Integer>();
		// analysis
		int i=2;
		while(num>1) {
			if (num%i == 0) {
				listNumbers.add(i);
				num = num/i;
				
			} else i++;
		}
		return listNumbers;
	}
	static public void displayAll(List<Integer> listNumbers) {
		for(Integer i : listNumbers) System.out.print(i + "\t");
	}

	public static void main(String[] args) {

		int n =2223233;
		System.out.println(isPrime(n));
		System.out.println();
		displayAll(analysisNumber(n));

	}

}
