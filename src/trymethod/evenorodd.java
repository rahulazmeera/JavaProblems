 package trymethod;

//import java.util.Scanner;
import java.util.*;
  

public class evenorodd{
	

public void even_odd (int x) {
		// TODO Auto-generated method stub

		//Scanner input=new Scanner(System.in);
		//declaring the type of value 
		//x=input.nextInt();
		//using if/else to check the parameter 
		//int x;
		
		if(x%2==0){
			
			System.out.println("EVEN NUMBER");
		}else{
				System.out.println("ODD NUMBER");
				
		}
	
		
}	

public static void main (String[] args){
	
	System.out.println("Enter number");
	Scanner input=new Scanner(System.in);
	int y=input.nextInt();
	evenorodd obj = new evenorodd();
	obj.even_odd(y);
	
}


		
}
