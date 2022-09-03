package thread;

class A22 extends Thread 
{
	@Override
		public void run() 
		{
			for(int i = 0; i <= 10; i++)
			{
				System.out.println("A"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
			
}
class B22 extends Thread
{
		@Override
		public void run() 
		{
			for(int i = 0; i <=10; i++)
			{
				System.out.println("B"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


public class B3 
{
	public static void main(String[] args) 
	{
		A22 a = new A22();
		B22 b = new B22();
		a.start();
		b.start();
	}
}

