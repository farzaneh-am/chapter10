package chapter10;

public class MethNestTry {
static void nestry(int a) {
	try {
		if(a==1) 
			a=a/(a-a);
		if(a==2) {
			int c[]= {1};
		c[42]=99;
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index out of Bounds"+e);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=args.length;
			int b=42/a;
			System.out.println("a= "+a);
			nestry(a);
		}catch(ArithmeticException e) {
			System.out.println("Division by zero "+e);
		}

	}

}
