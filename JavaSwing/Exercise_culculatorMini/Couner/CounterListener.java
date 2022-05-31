package Couner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
	private Counter_view ctv;
	public CounterListener(Counter_view ctv) {
		this.ctv= ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("nan");
		String src = e.getActionCommand();
		if(src.equals("UP")) {
			this.ctv.increment();
		}
		if(src.equals("DOWN")){
			this.ctv.decrement();
		}
		if(src.equals("RESET")){
			this.ctv.reset();
		}
	}

}
