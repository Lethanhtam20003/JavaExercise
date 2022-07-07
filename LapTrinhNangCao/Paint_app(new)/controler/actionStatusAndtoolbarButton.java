package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DrawingPanel;
import view.StatusPanel;
import view.ToolBarPanel;

public class actionStatusAndtoolbarButton implements ActionListener {

	private ToolBarPanel toolbar;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		toolbar.getStatus().setStrShape(src);
		switch (src) {
		case "line":
			toolbar.getDrawing().setShapeType(ToolBarPanel.line);
			break;
		case "rastangle":
			toolbar.getDrawing().setShapeType(ToolBarPanel.rastangle);
			break;
		case "cricle":
			toolbar.getDrawing().setShapeType(ToolBarPanel.cricle);
			break;
		case "paint":
			toolbar.getDrawing().setShapeType(ToolBarPanel.paint);
			break;
		}
	}
}
