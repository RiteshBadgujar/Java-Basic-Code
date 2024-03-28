class One
{
	public void One(){

	 	System.out.println("One class call");
	}
}

class Superkey extends One
{
	public void One()
		{
			super.One();
			System.out.println("Super  Method Run");

	    }
	public static void main(String args[])
	{
        Superkey  over = new Superkey ();

		over.One();
	}
}