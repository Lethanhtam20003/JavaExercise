package controler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ToolBarPanel;

public class actionStatusAndtoolbarColor implements ActionListener {
	private ToolBarPanel toolbar;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		toolbar.getStatus().setStrColor(src);
		switch (src) {
		case "WHITE":
			toolbar.getDrawing().setColor(Color.WHITE);
			break;
		case "BLACK":
			toolbar.getDrawing().setColor(Color.BLACK);
			break;
		case "pink":
			toolbar.getDrawing().setColor(Color.pink);
			break;
		case "BLUE":
			toolbar.getDrawing().setColor(Color.BLUE);
			break;
		case "RED":
			toolbar.getDrawing().setColor(Color.RED);
			break;
		case "green":
			toolbar.getDrawing().setColor(Color.green);
			break;
		}
	}
}
