class Overloading
{
	public void A()
		{
			System.out.println(" A class call");
	}

	public void A(int a)
	{
		System.out.println("B class call "+" parameter Value :-"+a);
	}

	public static void main(String args[]){

	Overloading over = new Overloading();

	over.A();
	over.A(10);

	}
}