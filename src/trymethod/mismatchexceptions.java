package trymethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mismatchexceptions {

	
	static Scanner input=new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("How old are you?");
		int age=checkValidage();
		
      
      if(age!=0){
    	  System.out.println("you'r age"+age+"years"); 
      }
	}
	private static int checkValidage() {
		// TODO Auto-generated method stub
		
		try{
			return input.nextInt();
		}catch (InputMismatchException e){
			
			input.next();
			System.out.print("that is not a whole number");
			
			return 0;
			
			
		}
		
		
	}

}
