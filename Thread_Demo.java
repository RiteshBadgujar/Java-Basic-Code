class Sample extends Thread{
	
	void show() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			System.out.println(" Thread Message");
			sleep(3000);
		}
	}
}

class Thread_Demo{

	public static void main(String args[]) throws InterruptedException
	{
		
		Sample sample = new Sample();
		sample.show();
	}
}