package model;

import java.awt.Point;

public class model_drawing {
	private String sphape;
	private String clolorShape;
	private Point p1;
	private Point p2;
	private boolean changePoint; 

	/**
	 * @param sphape
	 * @param clolorShape
	 */
	public model_drawing() {
		this.sphape = "";
		this.clolorShape = "";
		this.changePoint= true;
		this.p1 =  new Point(0,0);
		this.p2 =  new Point(0,0);
		
	}

	public boolean isChangePoint() {
		return changePoint;
	}

	public void setChangePoint(boolean changePoint) {
		this.changePoint = changePoint;
	}

	public String getSphape() {
		return sphape;
	}

	public void setSphape(String sphape) {
		this.sphape = sphape;
	}

	public String getClolorShape() {
		return clolorShape;
	}

	public void setClolorShape(String clolorShape) {
		this.clolorShape = clolorShape;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

}
