package thread;

class First
{
	public void send(String msg)
	{
		System.out.print("["+msg);
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.print("]\n");
	}
}

class Second extends Thread
{
	private String msg;
	private Thread t;
	First first;
	Second second;
	
	public Second(String m, First obj)
	{
		msg = m;
		first=obj;
	}
	public void run()
	{
		synchronized(first)
		{
				first.send(msg);
		}
	}
		
}
public class A2SyncThread 
{
	public static void main(String[] args) 
	{
		First fnew = new First();
		Second ss = new Second("Welcome", fnew);
		Second ss1 = new Second("Programmer", fnew);
		Second ss2 = new Second("new", fnew);
		
		ss.start();
		ss1.start();
		ss2.start();
	}
}
