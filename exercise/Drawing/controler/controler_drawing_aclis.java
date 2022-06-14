package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_drawing;

public class controler_drawing_aclis implements ActionListener {
	private view_drawing view;
	controler_drawing_mouseLis mlis = new controler_drawing_mouseLis(view);

	/**
	 * @param view
	 */
	public controler_drawing_aclis(view_drawing view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		switch (src) {
		case "Exit":
			System.exit(0);
			break;
		case "line":
			this.view.setShape("line");
			this.view.setLabelText("line");
			break;
		case "cirle":
			this.view.setShape("cirle");
			this.view.setLabelText("cirle");
			break;
		case "rectangle":
			this.view.setShape("rectangle");
			this.view.setLabelText("rectangle");
			break;
		case "black":
			this.view.setColorShape("black");
			this.view.setLabelText("black");
			break;
		case "blue":
			this.view.setColorShape("blue");
			this.view.setLabelText("blue");
			break;
		case "red":
			this.view.setColorShape("red");
			this.view.setLabelText("red");
			break;
				
		}
	}

}
