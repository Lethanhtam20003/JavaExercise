package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controler.listener_findWord;
import model.model_findWord;

public class view_findWord extends JFrame {
	private model_findWord model;
	private JTextArea jtextArea;
	private JTextField jtextField;
	private JLabel jlabel_result;

	/**
	 * @param model
	 * @throws HeadlessException
	 */
	public view_findWord() throws HeadlessException {
		this.model = new model_findWord();
		this.init();
	}

	private void init() {
		// create font
		Font font = new Font("aricult", Font.BOLD, 40);

		//this
		this.setTitle("Find Word");
		this.setFont(font);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set action listener
		listener_findWord ac = new listener_findWord(this);
		// label
		JLabel jlabel_document = new JLabel("Document");
		jlabel_document.setFont(font);
		jlabel_document.setForeground(Color.MAGENTA);
		jlabel_document.setSize(50, 50);

		JLabel jlabel_keyWord = new JLabel("Key Word:");
		jlabel_keyWord.setFont(font);
		
		//button
		JButton jbutton_statistic = new JButton("Statistic:");
		jbutton_statistic.setFont(font);
		jbutton_statistic.addActionListener(ac);

		 jlabel_result = new JLabel();
		jlabel_result.setFont(font);

		// text area
		 jtextArea = new JTextArea();
		jtextArea.setFont(font);
		jtextArea.setSize(300,300);

		// text field
		 jtextField = new JTextField();
		jtextField.setFont(font);
		
		//panel
		JPanel jpanel_center =  new JPanel();
		jpanel_center.setLayout(new GridLayout(2,1,30,30));
		jpanel_center.add(jlabel_document);
		jpanel_center.add(jtextArea);
		
		JPanel jpanel_south =  new JPanel();
		jpanel_south.setLayout(new GridLayout(2,2));
		jpanel_south.add(jlabel_keyWord);
		jpanel_south.add(jtextField);
		jpanel_south.add(jbutton_statistic);
		jpanel_south.add(jlabel_result);
		
		
		//this
		this.setLayout(new BorderLayout());
		this.add(jpanel_center,BorderLayout.CENTER);
		this.add(jpanel_south,BorderLayout.SOUTH);
		
		//allways the last method
		this.setVisible(true);
	}

	public void find() {
		this.model.setDocument(jtextArea.getText());
		this.model.setKeyWord(jtextField.getText());
		this.model.find();
		jlabel_result.setText(this.model.getResult());
	}

}
