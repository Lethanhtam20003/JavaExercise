package CompanyManagement;

import junit.framework.TestCase;

public class test extends TestCase {
	public void testConstructor() {
		Employee s1 = new Staff(101, "Le Nhan Minh", new day(2, 8, 1994), 1.2,"Thuộc bộ phận giao hàng");
		Employee s2 = new Staff(102, " Ai Nguyen", new day(1, 1, 1989), 1.5, "Thuộc bộ phận kế toán");
		
		Employee d1 = new Driver(201, "Ta Phap Quang", new day(12,5 , 1989), 2.5,new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(102, "xe khach", 2016),
				new ConsVehcle(new Vehicle(104, "xe ban tai", 2010), new MTVehicle()))));
		Employee d2 = new Driver(202, "Thien Dinh", new day(0, 0, 0), 0, new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(103, "xe bus", 2012),
				 new MTVehicle())));
		Employee d3 = new Driver(203, "Tran Tuan Minh", new day(0, 0, 0), 0,new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(103, "xe bus", 2012),
				new ConsVehcle(new Vehicle(104, "xe ban tai", 2010), new MTVehicle()))));
		
		IEmployee e = new ConsEmployee(s1, new ConsEmployee(s2, new ConsEmployee(d1, new ConsEmployee(d2,	new ConsEmployee(d3, new MTEmployee())))));
		
		IVehicle v = new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(102, "xe khach", 2016),new ConsVehcle(new Vehicle(103, "xe bus", 2012),
				new ConsVehcle(new Vehicle(104, "xe ban tai", 2010), new MTVehicle()))));
	}
	Employee s1 = new Staff(101, "Le Nhan Minh", new day(2, 8, 1994), 1.2,"Thuộc bộ phận giao hàng");
	Employee s2 = new Staff(102, " Ai Nguyen", new day(1, 1, 1989), 1.5, "Thuộc bộ phận kế toán");
	
	Employee d1 = new Driver(201, "Ta Phap Quang", new day(12,5 , 1989), 2.5,new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(102, "xe khach", 2016),
			new ConsVehcle(new Vehicle(104, "xe ban tai", 2010), new MTVehicle()))));
	Employee d2 = new Driver(202, "Thien Dinh", new day(0, 0, 0), 0, new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(103, "xe bus", 2012),
			 new MTVehicle())));
	Employee d3 = new Driver(203, "Tran Tuan Minh", new day(0, 0, 0), 0,new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(103, "xe bus", 2012),
			new ConsVehcle(new Vehicle(104, "xe ban tai", 2010), new MTVehicle()))));
	
	IEmployee e = new ConsEmployee(s1, new ConsEmployee(s2, new ConsEmployee(d1, new ConsEmployee(d2,	new ConsEmployee(d3, new MTEmployee())))));
	
	IVehicle v = new ConsVehcle(new Vehicle(101, "xe tai", 2020),new ConsVehcle(new Vehicle(102, "xe khach", 2016),new ConsVehcle(new Vehicle(103, "xe bus", 2012),
			new ConsVehcle(new Vehicle(104, "xe ban tai", 2010), new MTVehicle()))));
	public void testGetBirthday() {
		s1.getBirthday();
		s2.getBirthday();
	}
	public void salary() {
		assertEquals(s1.salaryRate, 1200000);
		
	}

}
