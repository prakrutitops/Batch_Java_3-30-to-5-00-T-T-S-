package thread;

public class I2DaemonThread extends Thread 
{
	@Override
	public void run() 
	{
		 if(Thread.currentThread().isDaemon())
		 {  
			 System.out.println("daemon thread work");
		 }
		 else
		 {  
			 System.out.println("user thread work");  
		 }  
	}
	public static void main(String[] args) 
	{
		I2DaemonThread d1 = new I2DaemonThread();
		I2DaemonThread d2 = new I2DaemonThread();
		d2.setDaemon(true);
		
		d1.start();
		d2.start();
	}
}
