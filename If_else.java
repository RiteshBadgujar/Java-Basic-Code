import java.util.Scanner;
public class If_else {
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		int a;

		System.out.println("Enetr the no :");

		a=x.nextInt();
		if(18<=a)
		{
			System.out.println("Allow for Driving");
		}
		else {
			System.out.println("Not allow for Driving");
		}
	}


}
