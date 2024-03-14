import java.util.Scanner;
class loop
{
	public static void main(String[] args)
	{
		int num=0;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the no :-");

		for(int i=1;i <= 10;i++)
		{
			num=s.nextInt();
			System.out.println(i+" -NO = "+num);
		}
	}
}