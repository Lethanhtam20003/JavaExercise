package De2018_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NhanVien implements Comparable<NhanVien>{
		private String id;
		private String name;
		private double salary;

		public NhanVien(String id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "NhanVien [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}

		@Override
		public int compareTo(NhanVien o) {
			System.out.println("d");
			// TODO Auto-generated method stub
			return name.compareTo(o.name);
//					(this.name.compareTo(this.name) != 0) ? this.name.compareTo(this.name)
//					: (this.salary > this.salary ? -1 : 1);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<NhanVien> NV = new ArrayList<NhanVien>();
			NV.add(new NhanVien("101", "le thib anh", 1000000));
			NV.add(new NhanVien("102", "le thia nhan", 1100000));
			NV.add(new NhanVien("103", "le phan hanh", 3000000));
			NV.add(new NhanVien("104", "nghuyen le khoi anh", 1000000));
			NV.add(new NhanVien("105", "le thic anh", 4000000));

			System.out.println(NV);
			System.out.println("soft");
			 Collections.sort(NV);
//			System.out.println(NV);
			 for(NhanVien n: NV) {
				 System.out.println(n);
			 }

		}
}
