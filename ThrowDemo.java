package chapter10;

public abstract class ThrowDemo {
static void demoperoc() {
	try {
		throw new NullPointerException("demo");
		}catch(NullPointerException e) {
			System.out.println("caught inside demoperoc.");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	demoperoc();
}catch(NullPointerException e) {
	System.out.println("recaught: "+e);
}
	}

}
