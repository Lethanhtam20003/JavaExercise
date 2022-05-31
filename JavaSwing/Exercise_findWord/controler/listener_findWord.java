package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_findWord;

public class listener_findWord implements ActionListener{
	private view_findWord view;
	
	/**
	 * @param view
	 */
	public listener_findWord(view_findWord view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.view.find();
	}

}
