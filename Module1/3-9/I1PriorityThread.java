package thread;

public class I1PriorityThread extends Thread 
{
	String name;
	
	
	@Override
	public void run() 
	{
		System.out.println("running...");
	}
	
	public static void main(String[] args) 
	{
		I1PriorityThread m1 = new I1PriorityThread();
		I1PriorityThread m2 = new I1PriorityThread();
		m1.setName("mythread-1");
		m1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Name of Thread m1:"+m1.getName());
		System.out.println("Priority of Thread m1:"+m1.getPriority());
		
		m2.setName("mythread-2");
		m2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority of Thread m2:"+m1.getPriority());
		System.out.println("Name of Thread m2:"+m1.getName());
		
		
		
		m1.start();
		m2.start();
	}
	
}
