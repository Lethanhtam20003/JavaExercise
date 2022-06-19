package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import controler.QLSV_listener;
import model.QLSV_model;
import model.Student;

public class QLSV_view extends JFrame {
	private QLSV_model model;
	Font font = new Font("Blackadder ITC", Font.BOLD, 30);
	QLSV_listener ac = new QLSV_listener(this);
	private JTextField textfield_name;
	private JTextField textfield_ID;
	private JTextField textfield_class;
	private JTextArea textArea;

	/**
	 * @param view
	 * @throws HeadlessException
	 */
	public QLSV_view(QLSV_model model) throws HeadlessException {
		this.model = new QLSV_model();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			this.init();// init componant
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void init() {
		this.setTitle("Quản lý sinh viên");
		this.setSize(500, 500);

		JPanel containPain = new JPanel();// contain main
		containPain.setLayout(new BorderLayout());

		JPanel panelMain_south = new JPanel();
		panelMain_south.add(createStudentPanel());

		JPanel panelMain_center = new JPanel();
		panelMain_center.setLayout(new BorderLayout());
		panelMain_center.add(createOutputPanel());

		containPain.add(panelMain_south, BorderLayout.NORTH);
		containPain.add(panelMain_center, BorderLayout.CENTER);
		this.setContentPane(containPain);
	}

	private JPanel createStudentPanel() {
		JPanel panel = new JPanel(new BorderLayout());

		// textField
		textfield_name = new JTextField();
		textfield_name.setFont(font);

		textfield_ID = new JTextField();
		textfield_ID.setFont(font);

		textfield_class = new JTextField();
		textfield_class.setFont(font);

		// label
		JLabel label_name = new JLabel("name:", JLabel.RIGHT);
		label_name.setFont(font);

		JLabel label_id = new JLabel("id:", JLabel.RIGHT);
		label_id.setFont(font);

		JLabel label_class = new JLabel("class:", JLabel.RIGHT);
		label_class.setFont(font);

		// button
		JButton button_add = new JButton("add");
		button_add.setFont(font);
		button_add.setSize(100, 100);
		button_add.addActionListener(ac);

		JButton button_delete = new JButton("delete");
		button_delete.setFont(font);
		button_delete.addActionListener(ac);

		JButton button_find = new JButton("findById");
		button_find.setFont(font);
		button_find.addActionListener(ac);

		JButton button_soft = new JButton("softByScore");
		button_soft.setFont(font);
		button_soft.addActionListener(ac);

		// panel
		JPanel panel_informationStudent = new JPanel();// panel support panel_center
		panel_informationStudent.setBorder(new TitledBorder("Student's information "));
		panel_informationStudent.setLayout(new GridLayout(3, 2, 10, 10));
		panel_informationStudent.add(label_id);
		panel_informationStudent.add(textfield_ID);
		panel_informationStudent.add(label_name);
		panel_informationStudent.add(textfield_name);
		panel_informationStudent.add(label_class);
		panel_informationStudent.add(textfield_class);

		JPanel panel_Button = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel_Button.setBorder(new TitledBorder("manipulation"));
		panel_Button.add(button_add);
		panel_Button.add(button_delete);
		panel_Button.add(button_find);
		panel_Button.add(button_soft);

		panel.add(panel_informationStudent, BorderLayout.CENTER);
		panel.add(panel_Button, BorderLayout.SOUTH);

		return panel;
	}

	private JPanel createOutputPanel() {
		JPanel panelResult = new JPanel();
		panelResult.setBorder(new TitledBorder("Student list"));
		panelResult.setLayout(new GridLayout(0, 1, 0, 0));
		// scrollpane
		JScrollPane scrollpane = new JScrollPane();
		// text area
		textArea = new JTextArea(10, 10);
		textArea.setText(this.model.showit());
		scrollpane.setViewportView(textArea);
		panelResult.add(scrollpane);
		return panelResult;
	}

	public JTextField getTextfield_name() {
		return textfield_name;
	}

	public void setTextfield_name(JTextField textfield_name) {
		this.textfield_name = textfield_name;
	}

	public JTextField getTextfield_ID() {
		return textfield_ID;
	}

	public void setTextfield_ID(JTextField textfield_ID) {
		this.textfield_ID = textfield_ID;
	}

	public JTextField getTextfield_class() {
		return textfield_class;
	}

	public void setTextfield_score(JTextField textfield_birth) {
		this.textfield_class = textfield_birth;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	// method main
	public void addST(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		this.model.addST(string, string2, string3);
	}

	public void showlist() {
		String showit = this.model.showit();
		textArea.setText(showit);
	}

	public void delete(String text) {
		// TODO Auto-generated method stub
		this.model.deleteSt(text);
	}

	public void softByScore() {
		this.model.softByScore();
	}

	public void findById(String text) {
		// TODO Auto-generated method stub
		Student st = this.model.findByID(text);
		this.textArea.setText("id \t\t name " + st.getId() + "\t" + st.getName());
	}

	public void updatePane() {
		// TODO Auto-generated method stub
		Dimension d =  this.getSize();
		this.pack();
		this.setSize(d);
	}

}
