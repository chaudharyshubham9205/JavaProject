/*
 3.Create a class Calculator with two methods add() and substract() and default and parameterized constructor
 Overload theses methods--
   int add(int,int)
   double add(double,int,int)
   String add(String,String)

  int substract(int,int)
   double substract(double,double)
 */
package oopsProject;

public class Calculator {
   //overloaded add methods with different parameters
	public void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println(+z);
		
		
		}
	public void add(double x,int y,int z)
	{
		double t;
		
		t= x+y+z;
		System.out.println(+t);
	}
	public void add(String x,String y)
	{
		String z;
		z= x+y;
		System.out.println(z);
	}
    //overloaded subtract method
	public void Sub(int a ,int b)
	{
		int c;
		
		c= a-b;
		System.out.println(+c);
	}
public void Sub(double a,double b)
{
	double c;
	c=a-b;
}

}
