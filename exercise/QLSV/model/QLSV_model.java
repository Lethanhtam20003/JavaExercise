package model;

import java.util.ArrayList;
import java.util.List;

public class QLSV_model {
	public List<Student> listST;
	public QLSV_model() {
		this.listST = new ArrayList<Student>();
	}
	
	
	
	public void addSt(String id, String name,String ofClass) {

		if (cheakID(id))
			return;
		listST.add(new Student(id, name,ofClass));

	}

	private boolean cheakID(String id) {
		// TODO Auto-generated method stub
		for (Student st : listST)
			if (st.cheakID(id))
				return true;
		return false;
	}

	public Student findByID(String id) {
		// TODO Auto-generated method stub
		for (Student st : listST)
			if (st.cheakID(id))
				return st;
		return null;
	}

	public void deleteSt(String id) {
		Student st = findByID(id);
		listST.remove(st);
	}

	public void display() {
		for (Student st : listST)
			System.out.println(st);
	}

	public String showit() {
		String result = "id \t\t name \t\t class \n";
		for (Student st : listST)
			result+=st.getId()+"\t"+st.getName()+"\t"+st.getOfClass()+"\n";
		return result;
	}

 

	public void softByScore() {
		
	}
	
}
