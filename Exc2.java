package chapter10;
public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a,d;
			d=0;
			a=42/d;
			System.out.println("This will not be printed");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divid by zero");
		}
		System.out.println("After catch statment.");
	}
	

}
