abstract class one
{
     public void o(){
		System.out.println("A class call");
	}
}

 abstract class two extends one
{

	public void p(){
  System.out.println("B child class");
	}

}
class Abstraction extends child
{
	public void R()
	{
		System.out.println("C class call");
	}
	public static void main(String args[])
	{
		Multiple in = new Multiple();
		in.o();
		in.p();
		in.R();
	}

}