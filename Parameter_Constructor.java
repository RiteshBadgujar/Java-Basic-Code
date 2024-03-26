class  Parameter_Constructor
{
	public int Parameter_Constructor(int a)
	{
		//int a;
		System.out.println("Parameter Constructor call = "+a);
		return 0;
	}

	public static void main(String [] args){

		Parameter_Constructor cons = new Parameter_Constructor();
		cons.Parameter_Constructor(10);

		}
}