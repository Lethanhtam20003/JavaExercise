package SHape;
import java.awt.Color;
import java.awt.Graphics;

public abstract class AShape {
	int x,y;
	Color color;
	public AShape(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public abstract void paint(Graphics g);
	public abstract void resize(int x2, int y2);
}
