package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controler.Culculator_listener;
import model.Culculator_model;

public class Culculator_view extends JFrame {
	private Culculator_model model;
	private JTextField text1;
	private JTextField text2;
	private JTextField answed;

	public Culculator_view() throws HeadlessException {
		this.model = new Culculator_model();
		this.init();
	}

	private void init() {
		//
		this.setTitle("mini culculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// font
		Font font_1 = new Font("arial", Font.BOLD, 30);
		// jtextfield
		text1 = new JTextField();
		text1.setSize(40, 40);
		text2 = new JTextField();
		text2.setSize(40, 40);
		answed = new JTextField();
		answed.setSize(40, 40);

		// label
		JLabel jlabel_1 = new JLabel("1st Value");
		jlabel_1.setFont(font_1);
		JLabel jlabel_2 = new JLabel("2nd Value");
		jlabel_2.setFont(font_1);
		JLabel jlabel_answed = new JLabel("answed");
		jlabel_answed.setFont(font_1);
		// listener
		Culculator_listener ac = new Culculator_listener(this);
		// button
		JButton jbutton_plus = new JButton("+");
		jbutton_plus.setFont(font_1);
		jbutton_plus.addActionListener(ac);

		JButton jbutton_minus = new JButton("-");
		jbutton_minus.setFont(font_1);
		jbutton_minus.addActionListener(ac);

		JButton jbutton_nhan = new JButton("*");
		jbutton_nhan.setFont(font_1);
		jbutton_nhan.addActionListener(ac);

		JButton jbutton_chia = new JButton("/");
		jbutton_chia.setFont(font_1);
		jbutton_chia.addActionListener(ac);

		JButton jbutton_mod = new JButton("MOD");
		jbutton_mod.setFont(font_1);
		jbutton_mod.addActionListener(ac);

		JButton jbutton_mu = new JButton("^");
		jbutton_mu.setFont(font_1);
		jbutton_mu.addActionListener(ac);

		// panel_1
		JPanel jpanel_view = new JPanel();
		jpanel_view.setLayout(new GridLayout(3, 2, 30, 30));
		jpanel_view.add(jlabel_1);
		jpanel_view.add(text1);
		jpanel_view.add(jlabel_2);
		jpanel_view.add(text2);
		jpanel_view.add(jlabel_answed);
		jpanel_view.add(answed);

		// panel_2
		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(2, 3));
		jpanel_button.add(jbutton_plus);
		jpanel_button.add(jbutton_minus);
		jpanel_button.add(jbutton_nhan);
		jpanel_button.add(jbutton_chia);
		jpanel_button.add(jbutton_mod);
		jpanel_button.add(jbutton_mu);

		// this
		this.setLayout(new BorderLayout());
		this.add(jpanel_view, BorderLayout.CENTER);
		this.add(jpanel_button, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void plus() {
		double first_value =Double.valueOf( text1.getText());
		double second_value =Double.valueOf(text2.getText());
		this.model.setFirst_value(first_value);
		this.model.setSecond_value(second_value);
		this.model.plus();
		this.answed.setText(this.model.getAnswed_value()+"");
		
	}

	public void minus() {
		double first_value =Double.valueOf( text1.getText());
		double second_value =Double.valueOf(text2.getText());
		this.model.setFirst_value(first_value);
		this.model.setSecond_value(second_value);
		this.model.minus();
		this.answed.setText(this.model.getAnswed_value()+"");
	}

	public void multiply() {
		double first_value =Double.valueOf( text1.getText());
		double second_value =Double.valueOf(text2.getText());
		this.model.setFirst_value(first_value);
		this.model.setSecond_value(second_value);
		this.model.multiply();
		this.answed.setText(this.model.getAnswed_value()+"");
	}

	public void divide() {
		double first_value =Double.valueOf( text1.getText());
		double second_value =Double.valueOf(text2.getText());
		this.model.setFirst_value(first_value);
		this.model.setSecond_value(second_value);
		this.model.divide();
		this.answed.setText(this.model.getAnswed_value()+"");
	}

	public void power() {
		double first_value =Double.valueOf( text1.getText());
		double second_value =Double.valueOf(text2.getText());
		this.model.setFirst_value(first_value);
		this.model.setSecond_value(second_value);
		this.model.power();
		this.answed.setText(this.model.getAnswed_value()+"");
	}

	public void mod() {
		double first_value =Double.valueOf( text1.getText());
		double second_value =Double.valueOf(text2.getText());
		this.model.setFirst_value(first_value);
		this.model.setSecond_value(second_value);
		this.model.mod();
		this.answed.setText(this.model.getAnswed_value()+"");
	}

}
