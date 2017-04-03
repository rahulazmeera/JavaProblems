package trymethod;

public class trycathmethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		devideByZero(2);
		
	}

	public static void devideByZero(int a)
	{
		try{
			
			System.out.println(a/0);
			
		}
		catch (ArithmeticException t){
			
			System.out.println("you cant do that");

			//to get the message what was went wrong....
			System.out.println(t.getMessage());	
		//to get the type of exception error
		
		System.out.println(t.toString());
		
		//to get the print of the class in which the error happening 
		t.printStackTrace();
		
		}
		
		
	}	
}
