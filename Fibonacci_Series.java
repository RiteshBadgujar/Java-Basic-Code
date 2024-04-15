import java.util.Scanner;

class Fibonacci_Series{

		public static void main(String args[])
		{
			int a=0;
			int b=1;
			int c=0;
			int level;


			Scanner obj = new Scanner(System.in);

			System.out.println("Enter the Level No:");
			level=obj.nextInt();

			System.out.println(a+"\n"+b);

			for(int i=2; i<=level; i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;

			}
		}
}