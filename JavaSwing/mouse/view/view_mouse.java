package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import controler.controler_mouse;
import model.model_mouse;

public class view_mouse extends JFrame {
	model_mouse model = new model_mouse();
	private JLabel label_x;
	private JLabel label_y;
	private JLabel label_xcheckIn;
	private JLabel label_count;
	controler_mouse mouse = new controler_mouse(this);

	/**
	 * @param model
	 * @throws HeadlessException
	 */
	public view_mouse() throws HeadlessException {
		this.model = new model_mouse();
		this.init();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}

	private void init() {
		this.setTitle("mouse event");
		this.setLocationRelativeTo(null);

		JPanel containpain = new JPanel();
		containpain.setLayout(new BorderLayout());

		JPanel panelMain_center = new JPanel();
		panelMain_center.setLayout(new BorderLayout());
		panelMain_center.add(createPanel_Mouse());

		JPanel panelMain_south = new JPanel();
		panelMain_south.add(createPanel_information());

		containpain.add(panelMain_center, BorderLayout.CENTER);
		containpain.add(panelMain_south, BorderLayout.SOUTH);

		this.setContentPane(containpain);
	}

	private JPanel createPanel_Mouse() {
		JPanel panel_mouse = new JPanel(new BorderLayout());
		panel_mouse.setBorder(new TitledBorder("Mouse"));
		JScrollPane s = new JScrollPane();
		JTextArea t = new JTextArea();
		s.setViewportView(t);
		t.addMouseListener(mouse);
		t.addMouseMotionListener(mouse);
		
		panel_mouse.add(s,BorderLayout.CENTER);
		panel_mouse.setBackground(Color.CYAN);
		panel_mouse.addMouseListener(mouse);
		panel_mouse.addMouseMotionListener(mouse);
		return panel_mouse;
	}

	private JPanel createPanel_information() {
		JPanel panelResult = new JPanel(new GridLayout(3, 3, 5, 5));
		panelResult.setBorder(new TitledBorder("mouse location"));

		label_x = new JLabel("x= ");
		label_y = new JLabel("y= ");
		label_count = new JLabel();
		label_xcheckIn = new JLabel();
		JLabel label_empty1 = new JLabel();
		JLabel label_empty2 = new JLabel();

		panelResult.add(new JLabel("position: "));
		panelResult.add(label_x);
		panelResult.add(label_y);
		panelResult.add(new JLabel("number of click: "));
		panelResult.add(label_count);
		panelResult.add(label_empty1);
		panelResult.add(new JLabel("mouse is in component: "));
		panelResult.add(label_xcheckIn);
		panelResult.add(label_empty2);

		return panelResult;
	}

	public void click() {
		this.model.click();
		this.label_count.setText(this.model.getCount() + "");
	}

	public void enter() {
		this.model.enter();
		this.label_xcheckIn.setText(this.model.getChackIn());
	}

	public void exit() {
		this.model.exit();
		this.label_xcheckIn.setText(this.model.getChackIn());
	}

	

	public void update(int x, int y) {
		this.label_x.setText("x= " + x);
		this.label_y.setText("y= " + y);
		
	}

}
