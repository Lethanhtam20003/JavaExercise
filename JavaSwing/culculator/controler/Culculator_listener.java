package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Culculator_view;

public class Culculator_listener implements ActionListener {
	private Culculator_view view;

	/**
	 * @param view
	 */
	public Culculator_listener(Culculator_view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("+")) {
			this.view.plus();
		} else if (src.equals("-")) {
			this.view.minus();
		} else if (src.equals("*")) {
			this.view.multiply();
		} else if (src.equals("/")) {
			this.view.divide();
		} else if (src.equals("^")) {
			this.view.power();
		} else if (src.equals("MOD")) {
			this.view.mod();
		}
	}

}
