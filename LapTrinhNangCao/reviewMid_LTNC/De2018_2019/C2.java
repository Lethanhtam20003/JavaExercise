package De2018_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C2 {
	private List<NhanVien> NV = new ArrayList<NhanVien>();

	@Override
	public String toString() {
		return "C2 [NV=" + NV + "]";
	}

	public List<NhanVien> softNhanVien() {
		Collections.sort(this.NV, new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				return (o1.getName().compareTo(o2.getName()) != 0) ? o1.getName().compareTo(o2.getName())
						: (o1.getSalary() > o2.getSalary() ? -1 : 1);
			}

		});
		return NV;
	}

	public static void main(String[] args) {
		C2 c = new C2();
		c.NV.add(new NhanVien("101", "le thi anh", 1000000));
		c.NV.add(new NhanVien("102", "le thi nhan", 1100000));
		c.NV.add(new NhanVien("103", "le phan hanh", 3000000));
		c.NV.add(new NhanVien("104", "nghuyen le khoi anh", 1000000));
		c.NV.add(new NhanVien("105", "le thi anh", 4000000));

		System.out.println(c.NV);
		System.out.println("soft");
		c.NV = c.softNhanVien();
		System.out.println(c.NV);

	}
}
