package java_test;

public class Increment_Decrement_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		System.out.println("1. Post-Increment Operator : " + a + b++);
		System.out.println("2. Pre-Increment Operator : " + a + ++b);
		System.out.println("3. Post-Increment Operator : " + (a + b++));
		System.out.println("4. Pre-Increment Operator : " + (a + ++b));
	}

}
