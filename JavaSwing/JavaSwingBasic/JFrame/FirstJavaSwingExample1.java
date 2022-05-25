package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstJavaSwingExample1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();// tạo thể hiện của JFreme(tạo khung cửa sổ)
		
		JButton b = new JButton("click");// tạo button(tạo nút)
		b.setBounds(20,20,200,200);// thiết vị trí và kích thước của botton
		
		f.setTitle("geehehhe");//thiết lập tiêu đ�? của khung
		f.add(b);//thêm botton vào jFrame
		
		f.setSize(500, 500);// kính thước của jJFrame
		f.setLayout(null);//ko sử dụng trình quả lý bố cục
		f.setVisible(true);//hiện thị của sổ
	}
}
