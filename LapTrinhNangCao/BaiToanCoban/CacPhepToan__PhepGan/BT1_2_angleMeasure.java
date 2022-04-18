package CacPhepToan__PhepGan;
import java.util.Scanner;
public class BT1_2_angleMeasure {
	/**
	 * nhập một góc có đơn vị độ chuyển sang radian. tính sin có tan cot của goc đó
	 * @param angle
	 * @return
	 */
	public static double angleConversion(double angle) {
		//return angle* Math.PI/180;
		return Math.toRadians(angle); 
	}
	/**
	 * tính sin
	 * @param angle
	 * @return
	 */
	public static double calculateSin(double angle) {
		return Math.sin(angle);
	}
	/**
	 * tính cos()
	 * @param angle
	 * @return
	 */
	public static double calculateCos(double angle) {
		return Math.cos(angle);
	}
	/**
	 * tính tan()
	 * @param angle 
	 * @return
	 */
	public static double calculateTan(double angle) {
		return Math.tan(angle);
	}
	/**
	 * tính cotan()
	 * @param angle
	 * @return
	 */
	public static double calculateCot(double angle) {
		return calculateCos(angle)/calculateSin(angle);
	}
	static double number;
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print( "nhập số goc:" ); number = ip.nextInt();
		System.out.println("goc khi chuyển sang rad:"+angleConversion(number));
		System.out.println("sin("+number+"):"+ calculateSin(number));
		System.out.println("cos("+number+"):"+ calculateCos(number));
		System.out.println("tan("+number+"):"+ calculateTan(number));
		System.out.println("cotan("+number+"):"+ calculateCot(number));
	}
}