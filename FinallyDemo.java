package chapter10;

public class FinallyDemo {
static void pracA() {
	try {
		System.out.println("inside pracA");
		throw new RuntimeException ("demo");
	}finally
	{
		System.out.println("pracA's finally");
		
	}
}
static void pracB() {
	try {
		System.out.println("inside pracB");
		return;
	}finally
	{
		System.out.println("pracB's finally");
		
	}
}
static void pracC() {
	try {
		System.out.println("inside pracC");
		
	}finally
	{
		System.out.println("pracC's finally");
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			pracA();
			
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
		pracB();
		pracC();
	}

}
