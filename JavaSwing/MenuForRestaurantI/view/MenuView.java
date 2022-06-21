package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import controler.MenuControler;
import model.MenuModel;

public class MenuView extends JFrame {
	private MenuModel model;
	MenuControler ac = new MenuControler(this);
	private ButtonGroup group_monchinh;
	private ArrayList<JCheckBox> button_monphu;
	private JTextArea textArea;
	private JLabel label_totalMoney;
	private JPanel contentpane;
	private boolean checkContentpane;
	private JPanel panel_Choose;
	private JPanel panel_change2;
	private JPanel panel_change;
	private JList l;
	private JComboBox<String> cbb;

	public ButtonGroup getGroup_monchinh() {
		return group_monchinh;
	}

	public void setGroup_monchinh(ButtonGroup group_monchinh) {
		this.group_monchinh = group_monchinh;
	}

	public ArrayList<JCheckBox> getButton_monphu() {
		return button_monphu;
	}

	public void setButton_monphu(ArrayList<JCheckBox> button_monphu) {
		this.button_monphu = button_monphu;
	}

	public MenuModel getModel() {
		return model;
	}

	public boolean isCheckContentpane() {
		return checkContentpane;
	}

	public void setCheckContentpane(boolean checkContentpane) {
		this.checkContentpane = checkContentpane;
	}

	public void setModel(MenuModel model) {
		this.model = model;
	}

	public JList getL() {
		return l;
	}

	public void setL(JList l) {
		this.l = l;
	}

	public JComboBox<String> getCbb() {
		return cbb;
	}

	public void setCbb(JComboBox<String> cbb) {
		this.cbb = cbb;
	}

	/**
	 * @param model
	 * @throws HeadlessException
	 */
	public MenuView(MenuModel model) throws HeadlessException {
		super("Menu");
		this.setSize(500, 500);
		this.model = new MenuModel();
		this.createJmenu();
		this.init();
		this.changePanel_Choose();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		this.checkContentpane = true;

		JPanel jpn_mainDish = create_JPanel_mainDish();
		JPanel jpn_extraDish = create_JPanel_extraDish();

		// head
		panel_Choose = new JPanel();
		panel_Choose.setLayout(new BorderLayout());
		panel_change = new JPanel();
		panel_change.setLayout(new GridLayout(1, 2));
		panel_change.add(jpn_mainDish);
		panel_change.add(jpn_extraDish);
		panel_Choose.add(panel_change, BorderLayout.CENTER);
		// tail
		JPanel panel_Show = create_JPanel_Show();

		// contentpane

		contentpane = new JPanel();
		contentpane.setLayout(new GridLayout(2, 1));
		contentpane.add(panel_Choose);
		contentpane.add(panel_Show);
		this.getContentPane().add(contentpane);
	}

	private JPanel create_JPanel_mainDish() {
		// TODO Auto-generated method stub
		JRadioButton RaButton_null = new JRadioButton("");
		RaButton_null.addActionListener(ac);

		JRadioButton RaButton_P = new JRadioButton("phở");
		RaButton_P.addActionListener(ac);

		JRadioButton RaButton_HT = new JRadioButton("hủ tiếu");
		RaButton_HT.addActionListener(ac);

		JRadioButton RaButton_C = new JRadioButton("cháo");
		RaButton_C.addActionListener(ac);

		JRadioButton RaButton_LG = new JRadioButton("lagu");
		RaButton_LG.addActionListener(ac);

		JRadioButton RaButton_BC = new JRadioButton("bún chả");
		RaButton_BC.addActionListener(ac);

		group_monchinh = new ButtonGroup();
		group_monchinh.add(RaButton_null);
		group_monchinh.add(RaButton_P);
		group_monchinh.add(RaButton_HT);
		group_monchinh.add(RaButton_C);
		group_monchinh.add(RaButton_LG);
		group_monchinh.add(RaButton_BC);

		JPanel mainDish = new JPanel();
		mainDish.setBorder(new TitledBorder("Món chính"));
		mainDish.setLayout(new GridLayout(5, 1));
		mainDish.add(RaButton_null);
		mainDish.add(RaButton_P);
		mainDish.add(RaButton_HT);
		mainDish.add(RaButton_C);
		mainDish.add(RaButton_LG);
		mainDish.add(RaButton_BC);

		return mainDish;

//		cbb.add(RaButton_P);
//		cbb.add(RaButton_HT);
//		cbb.add(RaButton_C);
//		cbb.add(RaButton_LG);
//		cbb.add(RaButton_BC);
//		mainDish.add(cbb);
	}

	private JPanel create_JPanel_extraDish() {
		// TODO Auto-generated method stub
		JCheckBox Button_Null = new JCheckBox();
		Button_Null.setText("");
		Button_Null.addActionListener(ac);

		JCheckBox Button_NM = new JCheckBox();
		Button_NM.setText("nước mía");
		Button_NM.addActionListener(ac);

		JCheckBox Button_NN = new JCheckBox();
		Button_NN.setText("nước ngọt");
		Button_NN.addActionListener(ac);

		JCheckBox Button_CP = new JCheckBox();
		Button_CP.setText("cà phê");
		Button_CP.addActionListener(ac);

		JCheckBox Button_S = new JCheckBox();
		Button_S.setText("sữa");
		Button_S.addActionListener(ac);

		JCheckBox Button_CVC = new JCheckBox();
		Button_CVC.setText("cá viên chiên");
		Button_CVC.addActionListener(ac);

		button_monphu = new ArrayList<JCheckBox>();
		button_monphu.add(Button_Null);
		button_monphu.add(Button_NM);
		button_monphu.add(Button_NN);
		button_monphu.add(Button_CP);
		button_monphu.add(Button_S);
		button_monphu.add(Button_CVC);

		JPanel extraDish = new JPanel();
		extraDish.setBorder(new TitledBorder("Món phụ"));
		extraDish.setLayout(new GridLayout(6, 1));
		extraDish.add(Button_Null);
		extraDish.add(Button_NM);
		extraDish.add(Button_NN);
		extraDish.add(Button_CP);
		extraDish.add(Button_S);
		extraDish.add(Button_CVC);

		return extraDish;
	}

	private JPanel create_JPanel_Show() {
		// TODO Auto-generated method stub
		textArea = new JTextArea();
		textArea.setEditable(false);
		JButton button_thanhToan = new JButton("thanh toán");
		button_thanhToan.addActionListener(ac);
		label_totalMoney = new JLabel();
		label_totalMoney.setBorder(new TitledBorder("Tổng số tiền:"));

		JPanel jPanel_choose = new JPanel();
		jPanel_choose.setBorder(new TitledBorder("Các món Bạn đã chọn: "));
		jPanel_choose.setLayout(new BorderLayout());
		jPanel_choose.add(textArea, BorderLayout.CENTER);

		JPanel jPanel_thanhToan = new JPanel();
		jPanel_thanhToan.setLayout(new GridLayout(1, 2));
		jPanel_thanhToan.add(button_thanhToan);
		jPanel_thanhToan.add(label_totalMoney);

		JPanel jPanel_Show = new JPanel();
		jPanel_Show.setLayout(new GridLayout(2, 1));
		jPanel_Show.add(jPanel_choose);
		jPanel_Show.add(jPanel_thanhToan);

		return jPanel_Show;
	}

	private JPanel create_JPanel_Show2() {
		// TODO Auto-generated method stub
		textArea = new JTextArea();
		textArea.setEditable(false);
		JButton button_thanhToan = new JButton("thanh toán");
		button_thanhToan.addActionListener(ac);
		label_totalMoney = new JLabel();
		label_totalMoney.setBorder(new TitledBorder("Tổng số tiền:"));

		JPanel jPanel_choose = new JPanel();
		jPanel_choose.setBorder(new TitledBorder("Các món Bạn đã chọn: "));
		jPanel_choose.setLayout(new BorderLayout());
		jPanel_choose.add(textArea, BorderLayout.CENTER);

		JPanel jPanel_thanhToan = new JPanel();
		jPanel_thanhToan.setLayout(new GridLayout(1, 2));
		jPanel_thanhToan.add(button_thanhToan);
		jPanel_thanhToan.add(label_totalMoney);

		JPanel jPanel_Show = new JPanel();
		jPanel_Show.setLayout(new GridLayout(2, 1));
		jPanel_Show.add(jPanel_choose);
		jPanel_Show.add(jPanel_thanhToan);

		return jPanel_Show;
	}

	public void updatethenthanhtoan() {
		// TODO Auto-generated method stub
		this.model.setTotalMoney(0);
		this.model.checkBill();
		this.textArea.setText(this.model.getSelectedDishes());
		this.label_totalMoney.setText(String.valueOf(this.model.getTotalMoney()));
	}

	public void changeContentpane() {
		if (checkContentpane == true) {
			checkContentpane = false;
			this.panel_Choose.remove(panel_change);
			this.panel_Choose.add(panel_change2);

		} else {
			checkContentpane = true;
			this.panel_Choose.remove(panel_change2);
			this.panel_Choose.add(panel_change);

		}
	}

	public void updateshow() {
		Dimension d = this.getSize();
		this.pack();
		this.setSize(d);
	}

	public void createJmenu() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("file");
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(ac);
		JMenuItem changeInit = new JMenuItem("Change init");
		changeInit.addActionListener(ac);

		menu.add(exit);
		menu.add(changeInit);
		menubar.add(menu);
		this.setJMenuBar(menubar);
	}

	private void changePanel_Choose() {
		this.checkContentpane = true;
		panel_change2 = new JPanel();
		JPanel jpn_mainDish2 = new JPanel();
		String[] monchinh = { "", "phở", "hủ tiếu", "cháo", "lagu", "bún chả" };
		cbb = new JComboBox<String>(monchinh);
		cbb.addActionListener(ac);
		jpn_mainDish2.add(cbb);
		JPanel jpn_extraDish2 = new JPanel();
		jpn_extraDish2.setLayout(new BorderLayout());
		String[] monPhu = { ".. ", "nước mía", "nước ngọt", "cà phê", "sữa", "cá viên chiên" };
		l = new JList<>(monPhu);
		jpn_extraDish2.add(l, BorderLayout.CENTER);
		// head
		panel_change2.setLayout(new GridLayout(1, 2));
		panel_change2.add(jpn_mainDish2);
		panel_change2.add(jpn_extraDish2);

	}

	public void resetResult() {
		this.textArea.setText("");
		this.label_totalMoney.setText("");
	}

}
