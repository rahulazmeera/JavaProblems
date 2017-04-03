package trymethod;

public class FinalKEywordusing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///there are three uses of the final method 
		//1. is to prevent the inheritance 
		//2. is to prevent overriding
		//3. to make the value of the variable as a constant 
		
		
		/* simply i can say that  it works with variables/constants, methods and with classes.
		  */
		
         System.out.print("example for constant variable");
         
        Test test=new Test();
        System.out.println(test.pi);
		
		

	}

}
class Test{
	public final double pi=3.14;
	Test(){
		
	}
	
	
	
}
