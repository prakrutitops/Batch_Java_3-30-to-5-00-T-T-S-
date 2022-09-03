package thread;

public class A1ThreadGroup implements Runnable
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		A1ThreadGroup MyRunnable = new A1ThreadGroup();
		ThreadGroup tg1  = new ThreadGroup("Group A");
		
		Thread t1 = new Thread(tg1, MyRunnable,"one");
		t1.start();
		Thread t2 = new Thread(tg1, MyRunnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, MyRunnable, "three");
		t3.start();
		System.out.println("Threa Group Name: "+tg1.getName());
		tg1.list();
	}
}
