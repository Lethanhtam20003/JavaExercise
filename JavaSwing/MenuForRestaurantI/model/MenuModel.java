package model;

import java.util.StringTokenizer;

public class MenuModel {
	private String selectedDishes;
	private double totalMoney;

	/**
	 * 
	 */
	public MenuModel() {
		this.selectedDishes = "";
		this.totalMoney = 0;
	}

	public String getSelectedDishes() {
		return selectedDishes;
	}

	public void setSelectedDishes(String selectedDishes) {
		this.selectedDishes = selectedDishes;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public void checkBill() {
		// TODO Auto-generated method stub
		StringTokenizer token = new StringTokenizer(selectedDishes, ",");
		while (token.hasMoreElements()) {
			String s = token.nextToken().trim();
			switch (s) {
			case "phở":
				this.totalMoney += 20000;
				break;
			case "hủ tiếu":
				this.totalMoney += 10000;
				break;
			case "cháo":
				this.totalMoney += 15000;

				break;
			case "lagu":
				this.totalMoney += 25000;

				break;
			case "bún chả":
				this.totalMoney += 45000;

				break;
			case "nước ngọt":
				this.totalMoney += 10000;

				break;
			case "cà phê":
				this.totalMoney += 15000;

				break;
			case "sữa":

				this.totalMoney += 25000;

				break;
			case "cá viên chiên":
				this.totalMoney += 2000;

				break;
			case "nước mía":
				this.totalMoney += 5000;

				break;
			}

		}
	}

}
