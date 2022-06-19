package test;

import model.QLSV_model;

public class STMTest {
	public static void main(String[] args) {
		QLSV_model main = new QLSV_model();
		System.out.println("sjhsj");
		main.addST("110", "hhh","sds");
		main.addST("111", "hello word","sds");
		main.addST("110", "hhh","sds");
		main.display();
	}
}
