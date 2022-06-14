package ChangeColor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class chuotphai	implements MouseListener {
	view view;
	
	/**
	 * @param view
	 */
	public chuotphai(ChangeColor.view view) {
		this.view = view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.isPopupTrigger()) {
			this.view.jpopupMenu.show(e.getComponent(),e.getX(),e.getY());
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
