
package bt1_9;

import java.util.Scanner;

public class BT6 {
	/**
	 * Bài Tập 6. (optional) Viết chò chơi đoán số. Đầu tiên CT phát sinh số ngẫu
	 * nhiên từ 1-100, sau đó yêu cầu người dùng nhập vào 1 số bất kỳ và cho biết số
	 * đó lớn hơn hay nhỏ hơn cho tới khi đoán đúng rồi xuất ra số lần người dùng đã
	 * đoán để ra kết quả
	 */
	public static void numberGuessingGame() {
		Scanner ip = new Scanner(System.in);
		int randomNumber = (int) (Math.ceil(Math.random() * 100));
		int count = 0;
		System.out.print("mời nhập số");
		int inputNumber = ip.nextInt();
		while (randomNumber != inputNumber) {
			count++;
			if (inputNumber > randomNumber) {
				System.out.println("số vừa nhập lớn hơn");
			} else {
				System.out.println("số vừa nhập nhỏ hơn.");
			}
			System.out.print("nhập lại số: ");
			inputNumber = ip.nextInt();
		}
		System.out.println("đáp an là:" + inputNumber);
		System.out.println("số lần nhập sai: " + count);
		return;
	}

	public static void main(String[] args) {
		numberGuessingGame();
	}

}
