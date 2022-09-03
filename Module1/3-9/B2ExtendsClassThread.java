package thread;

class A extends Thread
{
	@Override
	public void run() 
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("A"+i);
		}
		
	}
		
}
class B extends Thread
{
	@Override
	public void run() 
	{
		for(int i = 0; i <=10; i++)
		{
			System.out.println("B"+i);
		}
	}
}


public class B2ExtendsClassThread 
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		a.start();
		b.start();
		
	}
}
