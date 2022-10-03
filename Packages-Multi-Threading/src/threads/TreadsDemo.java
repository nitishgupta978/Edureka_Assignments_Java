package threads;

public class TreadsDemo {


	int counter = 5;

	static int N;

	// Function to print odd numbers
	public void printFiveTable() throws InterruptedException
	{
		synchronized (this)
		{
			// Print number till the N
			for(int i=1;i<=10;i++) {
				int total=counter*i;
				Thread.sleep(1000);
				System.out.println(counter+" x "+ i+" = "+total);
			}
		}
	}

	// Function to print even numbers
	public void printEvenNumber()
	{
		for( int i=0;i<N;i++) {
			if(i%2==0)
			System.out.println(i);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Given Number N

		// Create an object of class
		TreadsDemo mt = new TreadsDemo();
		N = 50;

		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				try {
					mt.printFiveTable();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
				mt.printEvenNumber();
			
		
		// Start both threads
		t2.start();
			}
}
