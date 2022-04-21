package CauLenhReNhanh;

public class Bai_8 {
	static public void PhuongTrinhBacNhat(int a,int b) {
		double x= 0;
		if(a==0) {
			System.out.println("he vo nghiem");
		}else if(b==0){
			System.out.println("he co nghiem x= "+x);
		}else {
			x=-b/a;
			System.out.println("he co nghiem x= "+x);
		}
	}
	public static void main(String[] args) {
		int a=0, b=3;
		System.out.println("a= "+a+", b= "+b +"\nta co he : \t "+a+"x+"+b+"=0");
		PhuongTrinhBacNhat(a, b);
	}	
}
