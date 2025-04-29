package Assignment;

abstract class Parent{
	abstract public void message();
	
}

class child1 extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
		
	}
	
}

class child2 extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
		
	}
	
}

public class P28 {
	public static void main(String[] args) {
		
		child1 c1 = new child1();
		c1.message();
		
		child2 c2 = new child2();
		c2.message();
	}

}

