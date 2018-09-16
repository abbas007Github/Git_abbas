package pack2;

class EvenNo implements Runnable
{
	public void run()
	{
		for(int i=0; i<=100; i+=2)
		{
			System.out.println(i);
		}
	}
}

class OddNo implements Runnable
{
	public void run()
	{
		for(int i=1; i<100;i+=2)
		{
			System.out.println(i);
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		EvenNo e1= new EvenNo();
		OddNo o1 = new OddNo();
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(o1);
		
		t1.start();
		t2.start();
		

	}

}
