package Ex7_4;

public abstract class AShape {
	public abstract double distanseToO();
	public abstract boolean between(int a, int b);
	public abstract Square boundingBox();
	public abstract CartPT translate();
	@Override
	public abstract String toString();
	@Override
	public abstract boolean equals(Object obj);
	
}
