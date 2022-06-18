package ThiGiuaKyPhanSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

public class controler_day implements ActionListener {
	 view view;

	/**
	 * @param view
	 */
	public controler_day(ThiGiuaKyPhanSwing.view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();

		switch (src) {
		case "tao dãy":
			this.view.createNumberSequence();
			break;
		case "kiểm tra dãy":
			this.view.showResult();
			break;
		}
	}

	public static void main(String[] args) {
		try {
			new view();
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
