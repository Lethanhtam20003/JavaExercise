package De2018_2019;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class view extends JFrame {
	private JLabel shapeTypeOP;
	private JLabel nameOP;
	private JLabel sexOP;
	private JLabel colorOP;
	private JLabel schoolOP;
	private JLabel ageOP;
	private JTextField nameIP;
	private JTextField schoolIP;
	private JRadioButton green;
	private JRadioButton yealow;
	private JRadioButton cricle;
	private JRadioButton square;
	private JRadioButton male;
	private JRadioButton fimale;
	private JRadioButton nho;
	private JRadioButton lon;
	private JPanel below;

	public view() {
		this.setTitle("");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(800, 600));

		JPanel contentpane = new JPanel();
		contentpane.setLayout(new GridLayout(2, 1));
		JPanel head = createHeadPanel();

		below = createBelowPanel();
		below.setBorder(new TitledBorder(""));
		below.setBackground(Color.green);

		contentpane.add(head);
		contentpane.add(below);

		this.setContentPane(contentpane);
		this.setVisible(true);
	}
//	ActionListener ac = new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			for(JRadioButton r: listRadioBT) {
//				if(r.isSelected()) {
//					String s =r.getText();
//					switch(s) {
//					case "Xanh":
//						colorOP.setText(s);
//						below.setBackground(Color.green);
//						break;
//					case "Vang":
//						colorOP.setText(s);
//						below.setBackground(Color.yellow);
//						break;
//					case "nam":
//						sexOP.setText(s);
//						break;
//					case "nu":
//						sexOP.setText(s);
//						break;
//					case "tron":
//						shapeTypeOP.setText(s);
//						break;
//					case "vuong":
//						shapeTypeOP.setText(s);
//						break;
//					case "6>12":
//						ageOP.setText(s);
//						break;
//					case "12":
//						ageOP.setText(s);
//						break;
//						
//					}
//				}
//			}
//			
//		}
//	};
	MouseListener ac2 = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			for (JRadioButton r : listRadioBT) {
				if (r.isSelected()) {
					String s = r.getText();
					switch (s) {
					case "Xanh":
						colorOP.setText(s);
						below.setBackground(Color.green);
						left.setBackground(Color.green);
						center.setBackground(Color.green);
						right.setBackground(Color.green);
						green.setBackground(Color.green);
						yealow.setBackground(Color.green);
						cricle.setBackground(Color.green);
						square.setBackground(Color.green);
						male.setBackground(Color.green);
						fimale.setBackground(Color.green);
						nho.setBackground(Color.green);
						lon.setBackground(Color.green);
						break;
					case "Vang":
						colorOP.setText(s);
						below.setBackground(Color.yellow);
						left.setBackground(Color.yellow);
						center.setBackground(Color.yellow);
						right.setBackground(Color.yellow);
						green.setBackground(Color.yellow);
						yealow.setBackground(Color.yellow);
						cricle.setBackground(Color.yellow);
						square.setBackground(Color.yellow);
						male.setBackground(Color.yellow);
						fimale.setBackground(Color.yellow);
						nho.setBackground(Color.yellow);
						lon.setBackground(Color.yellow);
						break;
					case "nam":
						sexOP.setText(s);
						break;
					case "nu":
						sexOP.setText(s);
						break;
					case "tron":
						shapeTypeOP.setText(s);
						break;
					case "vuong":
						shapeTypeOP.setText(s);
						break;
					case "6>12":
						ageOP.setText(s);
						break;
					case "12>18":
						ageOP.setText(s);
						break;

					}
				}
			}
		}
	};
	private ButtonGroup groupShape;
	private ButtonGroup groupColor;
	private ButtonGroup groupSet;
	private ButtonGroup groupAge;
	private ArrayList<JRadioButton> listRadioBT;
	private JPanel right;
	private JPanel center;
	private JPanel left;

	private JPanel createHeadPanel() {
		JPanel head = new JPanel();
		head.setLayout(new GridLayout(4, 3));
		JLabel shapeType = new JLabel("loai hinh:");
		JLabel name = new JLabel("ho va ten:");
		JLabel sex = new JLabel("gioi tinh:");

		 shapeTypeOP = new JLabel();
		 nameOP = new JLabel();
		 sexOP = new JLabel();

		JLabel color = new JLabel("mau sac:");
		JLabel school = new JLabel("hoc truong:");
		JLabel age = new JLabel("trong do tuoi:");

		  colorOP = new JLabel();
		  schoolOP = new JLabel();
		  ageOP = new JLabel();

		head.add(shapeType);
		head.add(name);
		head.add(sex);
		head.add(shapeTypeOP);
		head.add(nameOP);
		head.add(sexOP);
		head.add(color);
		head.add(school);
		head.add(age);
		head.add(colorOP);
		head.add(schoolOP);
		head.add(ageOP);

		return head;
	}

	private JPanel createBelowPanel() {
		JPanel below = new JPanel();
		below.setLayout(new GridLayout(1, 3, 20, 20));
		/*
		 * left
		 */
		  left = new JPanel();
		left.setLayout(new GridLayout(2, 3));
		// color
		JLabel color = new JLabel("mau sac:");
		  green = new JRadioButton("Xanh");
		  yealow = new JRadioButton("Vang");
		  groupColor = new ButtonGroup();
		groupColor.add(green);
		groupColor.add(yealow);
		// shape
		JLabel shape = new JLabel("Loai hinh:");
		  cricle = new JRadioButton("tron");
		  square = new JRadioButton("vuong");
		  groupShape = new ButtonGroup();
		groupShape.add(cricle);
		groupShape.add(square);

		left.add(color);
		left.add(green);
		left.add(yealow);
		left.add(shape);
		left.add(cricle);
		left.add(square);
		/*
		 * center
		 */
		  center = new JPanel();
		center.setLayout(new GridLayout(4, 1));
		JLabel name = new JLabel("ho va ten:");
		  nameIP = new JTextField();
		JLabel school = new JLabel("hoc truong:");
		  schoolIP = new JTextField();
		center.add(name);
		center.add(nameIP);
		center.add(school);
		center.add(schoolIP);
		/*
		 * right
		 */
		  right = new JPanel();
		right.setLayout(new GridLayout(2, 3));
		// color
		JLabel sex = new JLabel("gioi tinh:");
		  male = new JRadioButton("nam");
		  fimale = new JRadioButton("nu");
		 groupSet = new ButtonGroup();
		groupSet.add(male);
		groupSet.add(fimale);
		// shape
		JLabel age = new JLabel("do tuoi trong:");
		  nho = new JRadioButton("6>12");
		  lon = new JRadioButton("12>18");
		 groupAge = new ButtonGroup();
		groupAge.add(nho);
		groupAge.add(lon);

		right.add(sex);
		right.add(male);
		right.add(fimale);
		right.add(age);
		right.add(nho);
		right.add(lon);

		below.add(left);
		below.add(center);
		below.add(right);
		
		 listRadioBT = new ArrayList<JRadioButton>();
		listRadioBT.add(green);
		listRadioBT.add(yealow);
		listRadioBT.add(square);
		listRadioBT.add(cricle);
		listRadioBT.add(male);
		listRadioBT.add(fimale);
		listRadioBT.add(lon);
		listRadioBT.add(nho);
		
//		green.addActionListener(ac);
//		yealow.addActionListener(ac);
//		square.addActionListener(ac);
//		cricle.addActionListener(ac);
//		male.addActionListener(ac);
//		fimale.addActionListener(ac);
//		lon.addActionListener(ac);
//		nho.addActionListener(ac);
		
		green.addMouseListener(ac2);
		yealow.addMouseListener(ac2);
		square.addMouseListener(ac2);
		cricle.addMouseListener(ac2);
		male.addMouseListener(ac2);
		fimale.addMouseListener(ac2);
		lon.addMouseListener(ac2);
		nho.addMouseListener(ac2);
		
		
		
		return below;
	}
	
	
}
