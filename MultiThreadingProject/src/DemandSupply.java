/*
 Q.3 Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct. 
 */
class InterThreadCommunication
{
	int availableProduct=50;
	synchronized public void demandMethod(int avail)
	{
		if(availableProduct<avail) 
		{
			try {
				wait(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		else
			availableProduct-=avail;
			System.out.println("Demand product "+availableProduct);
		}
	
	synchronized public void supplyMethod(int i)
	{
		availableProduct+=i;
		System.out.println("Supply Product "+availableProduct);

		notify();
	}
}
class ThreadA extends Thread{
	InterThreadCommunication ds;
	ThreadA(InterThreadCommunication ds)
	{
		this.ds=ds;
	}
	public void run()
	{
		ds.demandMethod(2);
	}
}
class ThreadB extends Thread{
	InterThreadCommunication ds;
	ThreadB(InterThreadCommunication ds)
	{
		this.ds=ds;
	}
	public void run()
	{
		ds.supplyMethod(3);
	}
} 
public class DemandSupply {

	public static void main(String[] args) {
		
		InterThreadCommunication tc=new InterThreadCommunication();
			ThreadA th1=new ThreadA(tc);
			ThreadB th2=new ThreadB(tc);
			th1.start();
			th2.start();

	}

}