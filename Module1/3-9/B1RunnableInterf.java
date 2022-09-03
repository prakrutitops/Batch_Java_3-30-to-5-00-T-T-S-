package thread;

public class B1RunnableInterf implements Runnable 
{

	public void run() 
	{
		for(int i = 0; i <=10 ; i++)
			System.out.println("Thread"+i);
		
	}
	public static void main(String[] args) 
	{
		Thread new1 = new Thread(new B1RunnableInterf());
		new1.start();
	}

}
