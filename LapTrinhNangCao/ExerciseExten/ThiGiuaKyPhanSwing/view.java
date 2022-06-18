package ThiGiuaKyPhanSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class view extends JFrame {
	private model model;
	private JTextField textfield_ipN;
	private JTextArea textArea_opRes;
	private JLabel Label_res;
	ActionListener ac = new controler_day(this);

	/**
	 * @param model
	 * @throws HeadlessException
	 */
	public view() throws HeadlessException {
		super("dãy dảm dần");
		this.model = new model();
		this.setSize(500, 500);
		this.init();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	private void init() {
		// TODO Auto-generated method stub
		JPanel contentpane = new JPanel();
		contentpane.setLayout(new BorderLayout());
		contentpane.add(creapaneSOUTH(), BorderLayout.SOUTH);
		contentpane.add(creapanecenter(), BorderLayout.CENTER);
		contentpane.add(creapanenNORTH(), BorderLayout.NORTH);
		this.setContentPane(contentpane);

	}

	private JPanel creapanenNORTH() {
		// TODO Auto-generated method stub
		JPanel res = new JPanel();
		res.setLayout(new GridLayout());
		JPanel panel_nhapN = new JPanel();
		panel_nhapN.setLayout(new GridLayout(1, 2));
		textfield_ipN = new JTextField();
		textfield_ipN.setSize(100, 100);
		res.add(textfield_ipN);
		panel_nhapN.add(new JLabel("nhập n: ", JLabel.RIGHT));
		panel_nhapN.add(textfield_ipN);
		res.add(panel_nhapN);

		JPanel panel_button = new JPanel();
		JButton button_taoday = new JButton("tao dãy");
		button_taoday.addActionListener(ac);
		panel_button.add(button_taoday);

		JButton button_kiemtra = new JButton("kiểm tra dãy");
		button_kiemtra.addActionListener(ac);
		panel_button.add(button_kiemtra);

		res.add(panel_button);
		return res;
	}

	private JPanel creapanecenter() {
		JPanel res = new JPanel();
		res.setLayout(new BorderLayout());
		textArea_opRes = new JTextArea();
		textArea_opRes.setBackground(Color.WHITE);
		textArea_opRes.setBorder(new TitledBorder(""));
		textArea_opRes.setSize(500, 500);
		res.add(textArea_opRes, BorderLayout.CENTER);
		return res;
	}

	private JPanel creapaneSOUTH() {
		JPanel res = new JPanel();
		res.setLayout(new BorderLayout());
		Label_res = new JLabel();
		Label_res.setBorder(new TitledBorder("kết quả:"));
		res.add(Label_res, BorderLayout.CENTER);
		return res;
	}

	public void createNumberSequence() {
		int[] a = this.model.numberSequence((Integer.valueOf(this.textfield_ipN.getText())));
		this.model.setDay(a);
		this.textArea_opRes.setText(this.model.displayNumberSequence(a));

	}

	public void showResult() {
		// TODO Auto-generated method stub
		boolean check = this.model.increasingNumberSequence(this.model.getDay());
		if (check) {
			this.Label_res.setText("Chuổi này là chuổi giảm");
		} else {
			this.Label_res.setText("Chuổi này không phải là chuổi giảm");
		}

	}

}
