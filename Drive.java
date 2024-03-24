import java.util.Scanner;
public class Drive {
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		int a;

		System.out.println("Enetr the Age :");

		a=x.nextInt();
		if(18<=a)
		{
			System.out.println("Allow for Driving");
		}
		else {
			System.out.println("Not allow for driving");
		}
	}


}
