package Student;

import java.util.List;

public class Student {
	private String id;
	private String name;
	private double avg;
	private List<Subject> subject;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean cheakID(String id2) {
		// TODO Auto-generated method stub
		return this.id.equals(id2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.id+""+this.name;
	}
	
	
}
