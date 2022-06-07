package model;

public class model_mouse {
	private int x, y, count;
	private String chackIn;

	/**
	 * 
	 */
	public model_mouse() {
		this.x = 0;
		this.y = 0;
		this.count = 0;
		this.chackIn = "no";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getChackIn() {
		return chackIn;
	}

	public void setChackIn(String chackIn) {
		this.chackIn = chackIn;
	}

	public void click() {
		this.count++;
	}

	public void enter() {
		this.chackIn = "yes";
	}

	public void exit() {
		this.chackIn = "no";
	}

}
