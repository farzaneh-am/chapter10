package chapter10;

public class SuperSubCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=0;
			int b=42/a;
		}catch(ArithmeticException e) {
			System.out.println("This never rechable");
		
		
			
		}
		catch(Exception e) {
			System.out.println("Generic Exception Catch.");
		}
	}

}
