class One
{
	public void One(){

	 	System.out.println("One class call");
	}
}

class Super extends One
{
	public void One()
		{
			super.One();
			System.out.println(" Method Run");

	    }
	public static void main(String args[])
	{
		Super over = new Super ();

		over.One();
	}
}