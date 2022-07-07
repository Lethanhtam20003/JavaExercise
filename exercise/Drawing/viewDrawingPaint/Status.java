package viewDrawingPaint;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Status extends JPanel {
	private String strShape;
	private String strColor;
	private JLabel lbStrShapel;
	private JLabel lbStrColor;
	private JButton resetPain;
	private Drawing drawing;

	public Status(Drawing drawing) {
		this.drawing = drawing;
		// TODO Auto-generated constructor stub
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		lbStrShapel = new JLabel();
		lbStrColor = new JLabel();
		lbStrShapel.setText("Shape: dot");
		lbStrColor.setText("color: black");
		lbStrShapel.setPreferredSize(new Dimension(100, 30));
		lbStrColor.setPreferredSize(new Dimension(80, 30));
		resetPain = new JButton("reset");

		resetPain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = e.getActionCommand();
 
				if (str.equals("reset")) {
					drawing.resetpani();
				}
			}
		});
		this.add(lbStrShapel);
		this.add(lbStrColor);
		this.add(resetPain);

	}

	/**
	 * @param strShape the strShape to set
	 */
	public void setStrShape(String strShape) {
		this.strShape = strShape;
		lbStrShapel.setText(strShape);
	}

	/**
	 * @param strColor the strColor to set
	 */
	public void setStrColor(String strColor) {
		this.strColor = strColor;
		lbStrColor.setText(strColor);

	}
}
