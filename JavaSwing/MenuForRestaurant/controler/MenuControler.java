package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.UIManager;

import model.MenuModel;
import view.MenuView;

public class MenuControler implements ActionListener {
	private MenuView view;

	/**
	 * @param view
	 */
	public MenuControler(MenuView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String src = e.getActionCommand();
		if (src.equals("thanh toán")) {
			String monchinh = "";
			Enumeration<AbstractButton> button_monchinh = this.view.getGroup_monchinh().getElements();
			while (button_monchinh.hasMoreElements()) {
				AbstractButton a = button_monchinh.nextElement();
				if (a.isSelected()) {
					monchinh += a.getText();
				}
			}
			String monphu = "";
			//Enumeration<AbstractButton> button_monphu= this.view.getButton_monphu().();
			for(JCheckBox c : this.view.getButton_monphu() ) {
				if (c.isSelected()) {
					monphu += c.getText()+", ";
				}
			}
			this.view.getModel().setSelectedDishes(monchinh+", "+ monphu);
			this.view.updatethenthanhtoan();
		}
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new MenuView(new MenuModel());
		} catch (Exception e) {

		}
	}

}
