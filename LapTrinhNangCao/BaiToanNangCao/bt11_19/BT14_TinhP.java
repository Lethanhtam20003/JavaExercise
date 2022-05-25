package bt11_19;
/**
 * Bài Tập 14.	(5) Cho số tự nhiên n và số thực x. 
a)	Tính P = 1 + x + x2 + … + xn.
b)	Tính P = 1 – x + x2 – x3 + … + xn.
c)	Cho số tự nhiên n và số thực x. Hãy tính tổng S =  

 * @author lethanhtam
 *
 */
public class BT14_TinhP {
	public static  double Pa(double x,int n) {
		double p=0.0;
		for(int i=0;n>=i;i++) {
			p+=Math.pow(x, i);
		}
		return p;
	}
	
	public static  double Pb(double x,int n) {
		double p=0.0;
		for(int i=0,dau=1;n>=i;i++,dau=dau*(-1)) {
			p+=dau*Math.pow(x, i);
			
		}
		return p;
	}
	
	public static  double Pc(double x,int n) {
		double p=0.0;
		int daithua=1;
		for(int i=0;n>=i;i++) {
			daithua*=i;
			p+=Math.pow(x, i)/daithua;
		}
		return p;
	}
	
	public static void main(String[] args) {
	}
}
