import java.util.Scanner;
class Sum_of_all_Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num ;
		int sum=0;

		System.out.print("Enter the No :");
		num =sc.nextInt();

		for(int  i=1; i <= num; i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of the Number :"+sum);
	}
}