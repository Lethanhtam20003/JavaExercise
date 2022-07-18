package Cau1;

public class c1 {
	static public void checkCouble(int[] n,int x) {
		for(int i =0;i<n.length;i++) {
			int check = n[i];
			int j = i;
			for(j=i+1;j<n.length;j++) {
				if((check+n[j])==x) {
					System.out.println("("+check+","+n[j]+")\n");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {2,4,5,3,6,1,7,3,0,2,9,-2};
		checkCouble(a, 7);
	}
}
