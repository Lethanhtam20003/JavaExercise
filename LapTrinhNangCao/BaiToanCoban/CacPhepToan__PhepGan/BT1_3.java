package CacPhepToan__PhepGan;
import java.util.Scanner;
public class BT1_3 {
	
	public static String convertSencondsToHouse(int senconds) {
		int house = senconds / 3600;
		int minutes = senconds/60 - house*60;
		int sencondsLater = senconds%60;
		return house + "h"+minutes+"p"+sencondsLater+"s";
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		while(true) {
			int o;
		System.out.print("nhập vào thời gian cần chuyển đổi ");
		System.out.println(convertSencondsToHouse(o =ip.nextInt()));
		if(o== 0) {break;}
		}
	}
}

