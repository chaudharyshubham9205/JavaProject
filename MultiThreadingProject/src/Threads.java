/*
 Q.1 Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers)Set their name and properties.
 */
class ThreadEvenOdd
{
	 void runeven()
	{
		 System.out.println(Thread.currentThread().getName()+"The Even numbers are :");
			
			for(int i=0;i<22;i++)
			{	
				//condition for Even 
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+"Even number : "+i);
				}
			}
	}
	 void runodd()
	 {
		 System.out.println(Thread.currentThread().getName()+"The Odd numbers are :");
		 for(int i=0;i<25;i++)
			{	
				// condition for odd 
				if(i%2!=0)
				{
					System.out.println(Thread.currentThread().getName()+"Odd number : "+i);
				}
			}

	 }
}
class Even implements Runnable
{
	@Override
	public void run() 
	{
		ThreadEvenOdd e=new ThreadEvenOdd();
				e.runeven();		
	}
}


class Odd implements Runnable
{

	@Override
	public void run() {
		ThreadEvenOdd e=new ThreadEvenOdd();
				e.runodd();
		
	}	
}


public class Threads {

	public static void main(String[] args) {
		ThreadEvenOdd s=new ThreadEvenOdd();
		Even a=new Even();
		Odd b =new Odd();
		
		
		Thread th1=new Thread(a,"Thread 1 ");
		Thread th2=new Thread(b,"Thread 2 ");
		
		th1.start();
		th1.setPriority(1);
		th2.start();
		th2.setPriority(2);
	}

} 
	