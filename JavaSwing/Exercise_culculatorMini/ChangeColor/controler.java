package ChangeColor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controler implements ActionListener {
	private view view;

	public controler(ChangeColor.view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equals("change ac")) {
			this.view.changeAc();
		}
		if (view.getblo()) {
			if (src.equals("red")) {
				this.view.changeBackGround(Color.red);
			} else if (src.equals("black")) {
				this.view.changeBackGround(Color.black);
			} else if (src.equals("blue")) {
				this.view.changeBackGround(Color.blue);
			} else if (src.equals("gray")) {
				this.view.changeBackGround(Color.gray);
			} else if (src.equals("green")) {
				this.view.changeBackGround(Color.green);
			} else if (src.equals("pink")) {
				this.view.changeBackGround(Color.pink);
			}
		} else {
			
			if (src.equals("red")) {
				this.view.changecolor(Color.red);
			} else if (src.equals("black")) {
				this.view.changecolor(Color.black);
			} else if (src.equals("blue")) {
				this.view.changecolor(Color.blue);
			} else if (src.equals("gray")) {
				this.view.changecolor(Color.gray);
			} else if (src.equals("green")) {
				this.view.changecolor(Color.green);
			} else if (src.equals("pink")) {
				this.view.changecolor(Color.pink);
			}
		}
	}

}
