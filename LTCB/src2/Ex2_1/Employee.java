package Ex2_1;

public class Employee {
	String name;
	int hours;

	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	int wage() {
		return this.hours * 12;
	}

	double tax() {
		return this.wage() * 0.15;
	}

	double netpay() {
		return this.wage() - this.tax();
	}

	int raisedWage() {
		return this.wage() + 14;
	}

	boolean checkOverTime() {
		return this.hours > 100;
	}

}