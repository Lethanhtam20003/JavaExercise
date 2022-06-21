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
		if (src.equals("Exit"))
			System.exit(0);
		if (src.equals("Change init")) {
			this.view.changeContentpane();
			this.view.updateshow();
		}
		if (this.view.isCheckContentpane()) {
			this.view.resetResult();
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
				// Enumeration<AbstractButton> button_monphu= this.view.getButton_monphu().();
				for (JCheckBox c : this.view.getButton_monphu()) {
					if (c.isSelected()) {
						monphu += c.getText() + ", ";
					}
				}
				this.view.getModel().setSelectedDishes(monchinh + ", " + monphu);
				this.view.updatethenthanhtoan();
			}
		} else {
			this.view.resetResult();
			if (src.equals("thanh toán")) {
				String monchinh = this.view.getCbb().getSelectedItem().toString();
				String monphu="";
				Object[] cacmonphu = this.view.getL().getSelectedValues();
				// Enumeration<AbstractButton> button_monphu= this.view.getButton_monphu().();
				for (Object c :cacmonphu) {
						monphu = monphu + c.toString() + ", ";
					
				}
				this.view.getModel().setSelectedDishes(monchinh + ", " + monphu);
				this.view.updatethenthanhtoan();
			}
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
