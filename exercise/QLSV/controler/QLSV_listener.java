package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.QLSV_model;
import model.Student;
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
		this.view.updatePane();
		if (src.equals("add")) {
			this.view.addST(view.getTextfield_ID().getText(), view.getTextfield_name().getText(),
					view.getTextfield_class().getText());

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
	public static void main(String[] args) {
		QLSV_model model = new QLSV_model();
		QLSV_view view = new QLSV_view(model);
		view.addST("21130558", "nguyen van d","DTD21");
	}

}
