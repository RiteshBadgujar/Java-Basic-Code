class parent
{
     public void O(){
		System.out.println("A class call");
	}
}

  class child extends parent
{
	public void P(){
  System.out.println("B child class");
	}

}
class Multiple extends child
{
	public void R()
	{
		System.out.println("C class call");
	}

	public static void main(String args[])
	{
		Multiple in = new Multiple();
		in.O();
		in.P();
		in.R();
	}

}