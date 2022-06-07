package test;

import model.QLSV_model;

public class STMTest {
	public static void main(String[] args) {
		QLSV_model main = new QLSV_model();
		System.out.println("sjhsj");
		main.addSt("110", "hhh");
		main.addSt("111", "hello word");
		main.addSt("110", "hhh");
		main.display();
	}
}
