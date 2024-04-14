import java.util.Scanner;

class Even_Odd_No{

		public static void main(String args[])
		{
				int num;

				Scanner obj = new Scanner(System.in);

				System.out.println("Enter The No :");

				num = obj.nextInt();

				if(num % 2==0)
				{

					System.out.println("Number is Even");

				}
				else
				{

					System.out.println("Number is Odd");

				}

		}

	}