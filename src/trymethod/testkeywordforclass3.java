package trymethod;

public class testkeywordforclass3 {
///hear is the 3rd usage of the final key word in making of the classes. 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child=new Child();
		Daddy daddy=new Daddy();
		
		Child.dispaly();
		//Daddy.dispaly();
		
	}

}
final class Child{
	
public static void dispaly(){
	
	System.out.println("Rahul");
}
}

// at this case the the class daddy cannot be xtended to the child class because the child class made to final 
/*class Daddy extends Child {
	
	public void display(){
		
		
		System.out.println("Azmeera");
	}
	
	
	
}*/
