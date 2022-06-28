package app;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
public class StatusBar extends JPanel{
	JLabel status;

	String shapeStr = "";
	String colorStr = "";
	
	public void setShapeStr(String shapeStr) {
		this.shapeStr = shapeStr;
		update();
	}

	public void setColorStr(String colorStr) {
		this.colorStr = colorStr;
		update();
	}

	private void update() {
		status.setText(shapeStr + ":" + colorStr);
		
	}

	public StatusBar() {
		setLayout(new FlowLayout( FlowLayout.LEFT));
		add(status = new JLabel());
	}

}
