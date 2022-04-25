package EquationnOfDegreeII;

import java.util.Scanner;

public class Program {
	public float a,b,c;
    double x1,x2;
    double delta;
    public void nhap() {
    	Scanner ip = new Scanner(System.in);
    	System.out.println("nhap so");
    	a = ip.nextFloat();
    	b = ip.nextFloat();
    	c = ip.nextFloat();
    	
    }
    public double tinhdelta()
    {
        delta=((Math.pow(b, 2))-4*a*c);
        return delta;
    }
    public double nghiemduynhat()
    {
        x1=-c/b;
        System.out.println("x1 ="+x1);
        return x1;
    }
    public double nghiemkep()
    {
        x1=-b/(2*a);
        System.out.println("x1 ="+x1);
        return x1;
    }
    public void nghiemphanbiet()
    {
        x1=((-b+Math.sqrt(delta))/(2*a));
        x2=((-b-Math.sqrt(delta))/(2*a));
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);     
    }

}
