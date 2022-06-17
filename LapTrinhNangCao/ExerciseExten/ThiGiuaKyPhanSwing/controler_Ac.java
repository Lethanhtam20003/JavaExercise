package ThiGiuaKyPhanSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class controler_Ac implements ActionListener {
	static view view;

	/**
	 * @param view
	 */
	public controler_Ac(ThiGiuaKyPhanSwing.view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();

		switch (src) {
		case "tao dãy":
			this.view.createNumberSequence();
		case "kiểm tra dãy":
			this.view.showResult();
			break;
		}
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new view();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//JOptionPane.showInputDialog(" Bạn chua nhập N vào"
//		, JOptionPane.PLAIN_MESSAGE);
//break;
