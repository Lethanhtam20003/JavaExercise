package Jlabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Example {
    private JFrame Frame;
    private JLabel label1;
    private JLabel label2;
    private JPanel Panel;
    private JButton button;
    
 /**
  * constructor of class
  */
    public Example() {
        prepareGUI();
    }
 /// hàm main 
    public static void main(String[] args) {
        Example swingJlabelExam1 = new Example();
        swingJlabelExam1.showLabelDemo();
    }
 
    private void prepareGUI() {
        Frame = new JFrame("Vi du Java Swing");// tạo tiêu đề cho frame
        Frame.setSize(400, 300);
        Frame.setLayout(new GridLayout(3, 1));
        Frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        label1 = new JLabel("", JLabel.CENTER);
        label2 = new JLabel("", JLabel.CENTER);
        label2.setSize(350, 100);
        
        button = new JButton();
        button.setSize(10,100);
        
        Panel = new JPanel();
        Panel.setLayout(new FlowLayout());
        
        Frame.add(label1);
        Frame.add(Panel);
        Frame.add(label2);
        Frame.add(button);
        Frame.setVisible(true);
    }
 
    private void showLabelDemo() {
        label1.setText("Control in action: JLabel");
        JLabel label = new JLabel("", JLabel.CENTER);
        
        button.setText("botton ne");
        button.setBackground(Color.gray);
        
        label.setText("Chao mung ban den voi bai huong dan Java Swing.");
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        
        Panel.add(label);
        Panel.add(button);
        Frame.setVisible(true);
    }
}
