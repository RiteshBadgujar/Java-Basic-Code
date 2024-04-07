interface A
{
  public void call();


}

 class Multiples implements A
 {

	public void  call()
	 {
		  System.out.println("Multiple inheritance run");
	 }


	public static void main(String [] args)
	{
		Multiple mul = new Multiple();

		mul.call();

	}
}