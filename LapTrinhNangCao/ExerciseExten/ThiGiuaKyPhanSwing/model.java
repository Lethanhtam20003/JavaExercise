package ThiGiuaKyPhanSwing;

import java.util.Random;

public class model {
	
	private int[] day;
	public int[] getDay() {
		return day;
	}

	public void setDay(int[] day) {
		this.day = day;
	}

	public int[] numberSequence(int lenght) {
		
		int[] res = new int[lenght];
		Random rd = new Random();
		for (int i = 0; i < res.length; i++) {
			res[i] = rd.nextInt(-10, 10);
		}
		return res;
	}

	 public boolean increasingNumberSequence(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if(a[i] <a[i+1]) {
				return false;
			}
		}
		return true;

	}

	public String displayNumberSequence(int[] numberSequenceN) {
		 String res="";
		for (int c : numberSequenceN)
			res += c + ", ";
		return res;
	}
	
	public static void main(String[] args) {
		model m = new model();
		int[] a = m.numberSequence(56);
		for (int c : a)
			System.out.print(c + ", ");
		System.out.println( m.increasingNumberSequence(a));
		
	}
}
