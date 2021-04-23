package basic;

public class Lab {

	public static void main(String[] args) {

   //take the number n and sum it 
		System.out.println(sum(5));
		
   //take the number and give factorial
		System.out.println(factorial(5));
		
	//take the number and give factorial
		System.out.println(fact(5));
		
	int[] number = {1,2,456,-347,12,0};
	System.out.println("min Value: "+minvalue(number));
	System.out.println("max Value: "+maxvalue(number));
	System.out.println("max Value: "+Avgvalue(number));

	}
	//
	public static int Avgvalue(int[] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}	
			
		sum=sum/arr.length;
		
		return sum;
	}
	
	//
	public static int minvalue(int[] arr) {
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
			min=arr[i];
			}
		}
		
		return min;
	}
	//
	public static int maxvalue(int[] arr) {
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min) {
			min=arr[i];
			}
		}
		
		return min;
	}
	
	
	
	//
	public static  int sum(int n) {
		
	 int total=0;
		
		for(int i=1;i<=n;i++) {
			
			System.out.print(total+" + "+i);
			total=total+i;
			System.out.println("= "+total+" ");
			
			
		}
		return total;
	}
	
	//
	public static int factorial(int n) {
		
		int total=1;
		
		for(int i=1;i<=n;i++) {
			
			//System.out.print(total+" * "+i);
			total=total*i;
			System.out.println("= "+i+" ");
			
		}
		return total;
	}
	
	public static int fact(int n) {
		
		int total=1;
		
		if(n==0) {
			return 1;
		}
			
		System.out.println("= "+n+" ");
			
	
		return fact(n-1)*n;
	}

}
