package controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.view_mouse;
//sds
public class controler_mouse implements MouseListener,MouseMotionListener {
	view_mouse view ;
	
	/**
	 * @param view
	 */
	public controler_mouse(view_mouse view) {
		this.view = view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.view.click();
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
		this.view.enter();
		int x = e.getX();
		int y = e.getY();
		this.view.update(x,y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.view.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.view.update(x,y);
		
	}

}
