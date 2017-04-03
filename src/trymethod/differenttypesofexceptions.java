package trymethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class differenttypesofexceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
getAFILE("./somestuff.txt");
		
		
		
	}

	private static void getAFILE(String filename) {
		// TODO Auto-generated method stub
		
		try{
			FileInputStream file=new FileInputStream(filename);
		
	}catch (FileNotFoundException e){
		System.out.println("system cant find that file");
		
	}
		catch(IOException e){
			
			System.out.println("Unknow IO Error");
			
		}
		catch(Exception e){
			
			System.out.println("dont know about the error");
			
		}
		
		//this will do the duty of cleaning finally it closes the connection with dtabases of with any other are closed 
		finally{
			
			System.out.println("hey you sucessfully completed the excepton");
			
		}
		
	}

}
