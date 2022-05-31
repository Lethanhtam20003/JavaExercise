package Couner;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Counter_view extends JFrame{
	private Counter_model counter_model; 
	private JButton jbutton_up;
	private JButton jbutton_down;
	private JButton jbutton_reset;
	private JLabel  jlabel_value;
	
	public Counter_view() {
		this.counter_model =new  Counter_model();
		this.init();
		
		this.setVisible(true);
	}
	public void init(){
		this.setTitle("counter");
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		
		jbutton_up   = new JButton("UP");
		jbutton_up.addActionListener(ac);
		jbutton_down = new JButton("DOWN");
		jbutton_down.addActionListener(ac);
		jbutton_reset = new JButton("RESET");
		jbutton_reset.addActionListener(ac);
		jlabel_value = new JLabel(this.counter_model.getValue()+"",JLabel.CENTER);
		
		
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new BorderLayout());
		jpanel.add(jbutton_up,BorderLayout.WEST);
		jpanel.add(jlabel_value,BorderLayout.CENTER);
		jpanel.add(jbutton_down,BorderLayout.EAST);
		jpanel.add(jbutton_reset,BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel,BorderLayout.CENTER);
		}
	
	public void increment() {
		this.counter_model.increment();
		this.jlabel_value.setText(this.counter_model.getValue()+"");
	}
	public void decrement() {
		this.counter_model.decrement();
		this.jlabel_value.setText(this.counter_model.getValue()+"");
	}
	public void reset() {
		this.counter_model.reset();
		this.jlabel_value.setText(this.counter_model.getValue()+"");
	}
	
}
