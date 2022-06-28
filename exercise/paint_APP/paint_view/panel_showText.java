package paint_view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class panel_showText extends JPanel {
	private JLabel status;
	private String str;
	private Color color;
	private JButton lbColor;

	public panel_showText() {
		this.str = "";
		color = Color.black;
		this.setBorder(new TitledBorder("show status: "));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.status = new JLabel();
		status.setBorder(new TitledBorder("Shape"));
		status.setPreferredSize(new Dimension(80,50));
		
		 lbColor = new JButton();
		lbColor.setBackground(color);
		lbColor.setBorder(new TitledBorder("color"));
		lbColor.setPreferredSize(new Dimension(50,50));
		lbColor.isEnabled();;
		
		this.add(status);
		this.add(lbColor);
	}

	public void updatelabel() {
		this.status.setText(str);
	}
	public void updatecolor() {
		lbColor.setBackground(color);
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
		updatecolor();
	}

	/**
	 * @return the status
	 */
	public JLabel getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(JLabel status) {
		this.status = status;
	}

	/**
	 * @return the str
	 */
	public String getStr() {
		return str;

	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
		updatelabel();
	}

}
