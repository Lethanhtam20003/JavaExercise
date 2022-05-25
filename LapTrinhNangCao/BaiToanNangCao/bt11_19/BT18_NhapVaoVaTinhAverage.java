package bt11_19;

import java.util.Scanner;
/**
 * Bài Tập 18.	Viết chương trình yêu cầu người dùng nhập vào các số nguyên dương cho đến khi người dùng nhập vào số 0, 
 * rồi in ra: số lần người dùng nhập và giá trị trung bình của các số
 * @author lethanhtam
 *
 */
public class BT18_NhapVaoVaTinhAverage {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number,sum=0,count=0;
		double average;
		while(true) {
			System.out.print("Enter number: "); number = ip.nextInt();
			count++;
			sum+=number;
			System.out.println();
			if(number==0) {
				count--;
				average=(double)sum/count;
				System.out.println("average: "+average);
				System.out.println("count: "+count);
				break;
			}
		}
	}
}

