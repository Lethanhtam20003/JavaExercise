package test  ;


	import javax.swing.*;
	import javax.swing.border.TitledBorder;

	import java.awt.*;

	public class StudentView extends JFrame {
		
		public static void main(String[] args) {
			new StudentView("Quản lí sinh viên");
		}
		
		public StudentView(String string) {
			super(string);
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				initComponent();
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				pack();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void initComponent() {
			JPanel contentPane = new JPanel();
			contentPane.setLayout(new BorderLayout());
			
			JPanel jpnMain_North = new JPanel();
			jpnMain_North.add(creteStudentInfoPanel());
			
			JPanel jpnMain_Center = new JPanel();
			jpnMain_Center.setLayout(new BorderLayout());
			
			jpnMain_Center.add(createTablePanel());

			contentPane.add(jpnMain_North,BorderLayout.NORTH);
			contentPane.add(jpnMain_Center,BorderLayout.CENTER);
			setContentPane(contentPane);
		}
		public JPanel createTablePanel() {
			/* tạo ra panel jpn_TextArea để chứa JScrollPane và TextArea */
			JPanel jpn_TextArea = new JPanel();
			jpn_TextArea.setBorder(new TitledBorder("Text Area"));
			jpn_TextArea.setLayout(new GridLayout(0, 1, 0, 0));
				//tạo JScrollPane để chứa JTextArea
				JScrollPane scrollPane = new JScrollPane();
				JTextArea textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			/*add jScrollPane vào jpn_TextArea*/
			jpn_TextArea.add(scrollPane);
			return jpn_TextArea;
		}
		public JPanel creteStudentInfoPanel() {
			JPanel jpnInfoStudent = new JPanel();
			jpnInfoStudent.setLayout(new BorderLayout());
			/* tạo ra panel jpnInfoField_North cho phần NORTH của jpnInfoStudent */
				JPanel jpnInfoField_North = new JPanel();
				jpnInfoField_North.setLayout(new GridLayout(3,2,5,5));
				jpnInfoField_North.setBorder(new TitledBorder("Thông tin của sinh viên"));
					//tạo JLabel
					JLabel lb_StudentID = new JLabel("Mã số sinh viên: ", JLabel.RIGHT);
					JLabel lb_StudentName = new JLabel("Họ và tên: ", JLabel.RIGHT);
					JLabel lb_StudentAvgScore = new JLabel("Điểm trung bình: ", JLabel.RIGHT);
					//tạo JtextField
					JTextField txt_StudentID = new JTextField();
					JTextField txt_StudentName = new JTextField();
					JTextField txt_StudentAvgScore = new JTextField();
				/*[add các thành phần vào jpnInfoField_North]*/
				jpnInfoField_North.add(lb_StudentID);
				jpnInfoField_North.add(txt_StudentID);
				jpnInfoField_North.add(lb_StudentName);
				jpnInfoField_North.add(txt_StudentName);
				jpnInfoField_North.add(lb_StudentAvgScore);
				jpnInfoField_North.add(txt_StudentAvgScore);
			/* tạo ra panel jpnInfoButtons_Center cho phần NORTH của jpnInfoStudent */
				JPanel jpnInfoButtons_Center = new JPanel();
				jpnInfoButtons_Center.setLayout(new FlowLayout(FlowLayout.RIGHT));
				jpnInfoButtons_Center.setBorder(new TitledBorder("Thao tác"));
					//tạo buttons
					JButton btn_AddStudent = new JButton("Thêm sinh viên");
					JButton btn_RemoveStudent = new JButton("Xóa sinh viên");
					JButton btn_SortByName = new JButton("Xếp theo tên");
					JButton btn_SortByScore = new JButton("Xếp theo điểm");
				/*[add các thành phần vào jpnInfoField_North]*/
				jpnInfoButtons_Center.add(btn_AddStudent);
				jpnInfoButtons_Center.add(btn_RemoveStudent);
				jpnInfoButtons_Center.add(btn_SortByName);
				jpnInfoButtons_Center.add(btn_SortByScore);
				
			jpnInfoStudent.add(jpnInfoField_North, BorderLayout.NORTH);
			jpnInfoStudent.add(jpnInfoButtons_Center, BorderLayout.CENTER);
			return jpnInfoStudent;
		}
	}

