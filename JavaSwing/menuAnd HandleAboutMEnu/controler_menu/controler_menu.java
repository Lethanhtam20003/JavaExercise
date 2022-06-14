package controler_menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.AbstractButton;

import view_menu.view_menu;

public class controler_menu implements ActionListener, MouseListener {
	private view_menu view;

	/**
	 * @param view
	 */
	public controler_menu(view_menu view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();

		switch (src) {
		case "exit":
			System.exit(0);
			break;
		case "show tab":
			AbstractButton checkbox = (AbstractButton) e.getSource();
			boolean check = checkbox.getModel().isSelected();
			if (check) {
				this.view.enableToolbar();
			} else {
				this.view.disenableToolbar();
			}
			this.view.refreshthis();
			break;
		default:
			this.view.setTextJlabel("" + src);
			break;
		}

//		if(src.equals("new")) {
//		}else if(src.equals("open")) {
//		}else if(src.equals("exit")) {
//		}else if(src.equals("21")) {
//		}else if(src.equals("22")) {
//		}else if(src.equals("31")) {
//		}else if(src.equals("32")) {
//		}
//		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger()) {
			this.view.jpopupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
