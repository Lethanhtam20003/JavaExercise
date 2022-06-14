package ThiGiuaKyPhanSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controler_Ac implements ActionListener {
	view view;

	/**
	 * @param view
	 */
	public controler_Ac(ThiGiuaKyPhanSwing.view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		new view();
	}
}
