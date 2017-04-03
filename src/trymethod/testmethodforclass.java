package trymethod;

public class testmethodforclass {
// second use of the methods with the final keyword
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Daddy daddy=new Daddy();
		Child1 child=new Child1();
		
		daddy.display();
		child.display();
		
	}

}

 class Child1{
	public void display(){
	//	System.out.println("hey I am rahhuuu");
		
	}
	
	
	
	
}
 class Daddy extends Child1{
	
	@Override
	public void display(){
		System.out.println("heyy you my son");
	}
	
	
	
	

}

