abstract class parent
{
    abstract public void p();
}
class inheritance extends parent
{
	public void p()
	{
		System.out.println("call the Function");
	}
	public static void main(String args[])
	{
		inheritance in = new inheritance();
		in.p();
	}

}