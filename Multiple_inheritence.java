interface A
{
  public void call();


}
 class Multiple_inheritence implements A
 {

	public void  call()
	 {
		  System.out.println("Interface Succesfully run");
	 }


	public static void main(String [] args)
	{
		Multiple_inheritence mul = new Multiple_inheritence();

		mul.call();

	}
}