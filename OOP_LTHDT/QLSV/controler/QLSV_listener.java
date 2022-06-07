package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.QLSV_view;

public class QLSV_listener implements ActionListener {
	private QLSV_view view;

	/**
	 * @param view
	 */
	public QLSV_listener(QLSV_view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("add")) {
			this.view.addST(view.getTextfield_ID().getText(), view.getTextfield_name().getText(),
					view.getTextfield_score().getText());

			this.view.showlist();
		} else if (src.equals("delete")) {
			this.view.delete(view.getTextfield_ID().getText());
			this.view.showlist();
		} else if (src.equals("findById")) {
			this.view.findById(view.getTextfield_ID().getText());
		} else if (src.equals("softByScore")) {
			this.view.softByScore();
			this.view.showlist();
		}

	}

}
