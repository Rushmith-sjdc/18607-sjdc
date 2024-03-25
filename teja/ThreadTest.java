class A extends Thread
{
	public void run()
	{
		System.out.println("First Thread Even No's");
		for(int i=1;i<=20;i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("Second Thread Odd No's");
		for(int j=1;j<=20;j++)
		{
			if(j%2!=0)
				System.out.println(j);
		}
	}
}
class ThreadTest
{
	public static void main (String args[]) throws Exception
	{
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();
		obj2.setPriority(9);
	}
}