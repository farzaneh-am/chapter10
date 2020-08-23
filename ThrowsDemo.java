package chapter10;

public class ThrowsDemo {
static void throwon() throws IllegalAccessException {
	System.out.println("Inside Throwon.");
	throw new IllegalAccessException("demo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throwon();
		}catch(IllegalAccessException e) {
			System.out.println("Caught "+e);
			
		}
	}

}
