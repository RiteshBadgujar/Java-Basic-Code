abstract class parent
{
    abstract public void p();

}
class Abstract_Method extends parent
{
	public void p()
	{
		System.out.println("Function call");
	}
	public static void main(String args[])
	{
		Abstract_Method in = new Abstract_Method();
		in.p();
	}

}