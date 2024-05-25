class Swaping_Demo{

	public static void main(String args[])
       	{
		int a=10;
		int b=20;
		System.out.println("Before value:");
		System.out.println("\nA="+a+"\nB="+b);

		a = a^b;
		b = a^b;
		a = b^a;

		System.out.println("\nAfter Swaping:\n");
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}