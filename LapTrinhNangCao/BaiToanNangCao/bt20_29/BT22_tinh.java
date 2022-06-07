package bt20_29;

/*
 * Bài Tập 22.	Cho 2 số thực x và  (với  là giá trị sai số rất nhỏ). Viết chương trình tính

 */
public class BT22_tinh {
	private int x;
	private double y;

	public BT22_tinh() {
	}
	
	static public double a(double y) {
		double result=0;
		int index = 1;
		int count=1;
		while(1/index <y) {
			result+=1/index;
			count++;
			index*=count;
		}
		return result;
	}
	static public double b(int x,double y) {
		double result=0;
		int ValueX = 1;
		int index = 1;
		int count=1;
		double condition = 1;
		while(condition <y) {
			result+=ValueX/index;
			count++;
			index*=count;
			ValueX*=x;
			condition=(ValueX*x)/((count+1)*index);
		}
		return result;
	}
	//chua xong 
	static public double c(int x,double y) {
		double result=0;
		int ValueX = x;
		int index = 1;
		int count=1;
		double condition = 1;
		while(condition <y) {
			result+=ValueX/index;
			count+=2;
			index*=count;
			ValueX*=x*x;
			condition=(ValueX*x)/((count+1)*index);
		}
		return result;
	}
	
}
