package view;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusPanel extends JPanel {
	private String strShape;
	private String strColor;
	private JLabel showStatus;

	public StatusPanel() {
		// TODO Auto-generated constructor stub
		strShape = "line";
		strColor = "black";
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		showStatus = new JLabel("Shape: "+strShape + " ,Color: " + strColor);

		this.add(showStatus);

	}
	public void updateJlabelStatus() {
		this.showStatus.setText("Shape: "+strShape + " ,Color: " + strColor);
	}

	/**
	 * @return the strShape
	 */
	public String getStrShape() {
		return strShape;
	}

	/**
	 * @param strShape the strShape to set
	 */
	public void setStrShape(String strShape) {
		this.strShape = strShape;
		updateJlabelStatus();
	}

	/**
	 * @return the strColor
	 */
	public String getStrColor() {
		return strColor;
		
	}

	/**
	 * @param strColor the strColor to set
	 */
	public void setStrColor(String strColor) {
		this.strColor = strColor;
		updateJlabelStatus();
	}

	/**
	 * @return the showStatus
	 */
	public JLabel getShowStatus() {
		return showStatus;
	}

	/**
	 * @param showStatus the showStatus to set
	 */
	public void setShowStatus(JLabel showStatus) {
		this.showStatus = showStatus;
	}
	
}
