package chapter10;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10, b=0,vals[]= {1,2,3};
try {
	int result=a/b;
	vals[10]=19;
}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
	System.out.println("Exception Caught: "+e);
}
System.out.println("After Multi-catch");
	}

}
