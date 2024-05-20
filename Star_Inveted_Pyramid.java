class Star_Inveted_Pyramid
{
	public static void main(String args[])
	{
		int i,j;
		int num=10;

		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num-i+1;j++)
			{
				System.out.print(j);

			}
			System.out.println();
		}
	}
}