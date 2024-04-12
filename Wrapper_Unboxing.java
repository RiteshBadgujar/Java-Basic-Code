class Wrapper_Unboxing{

	public static void main(String args[]){

		//Wrapper to Premative

			Integer obj = new  Integer(20);
			int x = obj.intValue();
			int y = obj;				//Unboxing
			System.out.println(x+y);

		}

	}