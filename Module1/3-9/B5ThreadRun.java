package thread;

public class B5ThreadRun extends Thread 
{
	@Override
	public void run() 
	{
		for(int i = 0; i <10; i++)
			System.out.println(i);
		try 
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		B5ThreadRun a1 = new B5ThreadRun();
		B5ThreadRun a2 = new B5ThreadRun();
		a1.run();
		a2.run();
	}
}
