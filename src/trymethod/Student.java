package trymethod;

import java.util.Properties;

public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    studentname deatails1=new studentname();
		studentlastname detail1=new studentlastname();
		studentDOB    DOB=new studentDOB();
		
		
		deatails1.deatails1();
		detail1.lastname();
		DOB.dob();
		
		System.out.println(deatails1.firstname+detail1.lastname+DOB.date);
		
		
	}
	
}
			
		class studentname{
			String firstname;
		public void deatails1() {
			// TODO Auto-generated method stub
			System.out.println("something");
			
			
		}
		
		studentname(){
			
			firstname="something";
			
		}
		
		}
	
			
			class studentlastname{
				String lastname;
				
				public void lastname(){
					
					System.out.println("last");
					
			
					}
				
				studentlastname(){
					
					lastname= "last";
					
				}
									
				}
				
			
			
	
			
			
			class studentDOB{
				int date;
				public void dob(){
					
					System.out.println("18/6/1987");
					
				}
				studentDOB(){
					
					date=18;
					
				}

			}
			
			
	



