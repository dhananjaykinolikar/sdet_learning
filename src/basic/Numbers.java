package basic;

public class Numbers {
	
	public static void main(String[] arg) {
		System.out.println(" Enter two number");
		
		int num1=20;
		int num2=30;
		addNum(num1, num2);
		MultiplyNum(num1, num2);
		
		
	}
	
	static void addNum(int num1, int num2) {
		
		int addition=num1+num2;
		System.out.println(" the Addition of number is: "+addition);
	}
	static void MultiplyNum(int num1, int num2) {
		
		int product=num1*num2;
		System.out.println(" the Multiplication of number is: "+product);
		addNum(product, num2);
	}

}
