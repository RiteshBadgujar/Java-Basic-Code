import java.util.Scanner;
class Prime_No
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int num ;
		int a=0;

		System.out.print("Enter the Number :");
		num = scanner.nextInt();

		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				a++;
			}
		}
		if(a==2)
		{
			System.out.println("This is Prime Number");
		}
		else
		{
			System.out.println(" not Prime Number");
		}
	}
}