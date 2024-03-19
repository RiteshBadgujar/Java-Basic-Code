class One
{
	public void One(){

	 	System.out.println("One class call");
	}
}

class OverRidding extends One
{
	public void One()
		{
			super.One();
			System.out.println("OverRided Method Run");

	    }
	public static void main(String args[])
	{
		OverRidding  over = new OverRidding ();

		over.One();
	}
}