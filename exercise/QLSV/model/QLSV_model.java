package model;

import java.util.ArrayList;
import java.util.List;

public class QLSV_model {
	public List<Student> listStudent;
	public QLSV_model() {
		this.listStudent = new ArrayList<Student>();
		addST("21130555", "nguyen van a","DTD21");
		addST("21130556", "nguyen van b","DTD21");
		addST("21130557", "nguyen van c","DTD21");
		
	}
	
	
	
	public void addST(String id, String name,String ofClass) {

		if (cheakID(id))
			return;
		listStudent.add(new Student(id, name,ofClass));

	}

	private boolean cheakID(String id) {
		// TODO Auto-generated method stub
		for (Student st : listStudent)
			if (st.cheakID(id))
				return true;
		return false;
	}

	public Student findByID(String id) {
		// TODO Auto-generated method stub
		for (Student st : listStudent)
			if (st.cheakID(id))
				return st;
		return null;
	}

	public void deleteSt(String id) {
		Student st = findByID(id);
		listStudent.remove(st);
	}

	public void display() {
		for (Student st : listStudent)
			System.out.println(st);
	}

	public String showit() {
		String result = "id \t\t name \t\t class \n";
		for (Student st : listStudent)
			result+=st.getId()+"\t\r"+st.getName()+"\t\r"+st.getOfClass()+"\n";
		return result;
	}

 

	public void softByScore() {
		
	}
	
}
