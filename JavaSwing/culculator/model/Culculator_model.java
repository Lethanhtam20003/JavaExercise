package model;

public class Culculator_model {
	private double first_value;
	private double second_value;
	private double answed_value;
	
	/**
	 * @param first_value
	 * @param second_value
	 * @param answed_value
	 */
	public Culculator_model() {
		
	}

	public double getFirst_value() {
		return first_value;
	}

	public void setFirst_value(double first_value) {
		this.first_value = first_value;
	}

	public double getSecond_value() {
		return second_value;
	}

	public void setSecond_value(double second_value) {
		this.second_value = second_value;
	}

	public double getAnswed_value() {
		return answed_value;
	}

	public void setAnswed_value(double answed_value) {
		this.answed_value = answed_value;
	}
	
	public void plus() {
		this.answed_value= this.first_value+this.second_value;
	}
	public void minus() {
		this.answed_value= this.first_value-this.second_value;
	}
	public void multiply() {
		this.answed_value= this.first_value*this.second_value;
	}
	public void divide() {
		this.answed_value= this.first_value/this.second_value;
	}
	public void power() {
		this.answed_value= Math.pow(this.first_value,this.second_value);;
	}
	public void mod() {
		this.answed_value= this.first_value%this.second_value;
	}
	
}
