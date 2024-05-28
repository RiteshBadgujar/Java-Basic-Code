class All_String_Demo{

	public static void main(String[] args){

		String name1 = new String("Ritesh");
		String name2 ="Shubham";

		//String length();
		System.out.println(name1.length());
		System.out.println(name2.length());

		//String concat();
		System.out.println(name1.concat(name2));

		//String StartWith();
		System.out.println(name1.startsWith("R"));
		System.out.println(name2.startsWith("h"));

		//String endsWith();
		System.out.println(name1.endsWith("s"));
		System.out.println(name2.endsWith("R"));

		//String equle();
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name1));

		//String replace();
		System.out.println(name1.replace("Ritesh","Rohit"));
		System.out.println(name2.replace("Shubham","Ritesh"));



	}
}