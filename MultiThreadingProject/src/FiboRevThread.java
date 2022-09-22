/*
 Q.2 Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
 */
class FibonacciReverseSeries
{
	synchronized static public void fibonacci()
	{
		System.out.println(Thread.currentThread().getName()+"Fibonacci Series");
		int count=10,n1=0,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=2;i<count;++i)
		{
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	synchronized static public void reverse()
	{
		System.out.println("\n"+Thread.currentThread().getName()+"Reverse Order");
		for(int i=10;i>=1;i--)
		{
			System.out.println("Reverse Order : "+i);
		}
	}
}


class NewThread implements Runnable
{

	@Override
	public void run()
	{
		FibonacciReverseSeries s=new FibonacciReverseSeries();
		s.fibonacci();
	}
}


class NewThread1 implements Runnable
{

	@Override
	public void run()
	{
		FibonacciReverseSeries sc=new FibonacciReverseSeries();
		sc.reverse();
	}
}


public class FiboRevThread {

	public static void main(String[] args) {
		FibonacciReverseSeries sc=new FibonacciReverseSeries();
		NewThread a=new NewThread();
		NewThread1 b=new NewThread1();
		
		Thread th1=new Thread(a,"Thread 1 : ");
		Thread th2=new Thread(b,"Thread 2 : ");
		
		th1.start();
		
		th2.start();
	
	}
}
