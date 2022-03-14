package Ex2_6;

public class whatkind 
{
	int a,b,c;
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public whatkind(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	double denta()
	{
		return this.b*this.b - 4 * this.a* this.c;
	}
	
	/**
	 * determines whether the equation is degenerate and, if not,
	 *  how many solutions the equation has. The method produces one 
	 *  of four symbols: "degenerate", "two", "one", or "none".
	 * @return
	 */
	String SolveTheEquation()
	{
		if (this.a == 0)
		{
			return "degenerate";
		}
		if(this.denta() ==0)
		{
			return "one";
		}
		else if(this.denta() > 0)
		{
			return "two";
		}
		else 
		{
			return "none";
		}
		
	}
}
