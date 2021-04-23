package basic;

public class SalaryCalculator {
	
	public static void main(String[] arg) {
		
		System.out.println("Program starting");
		String career;
		
		career="Software Developer";
		
		System.out.println("My career is "+career);
		
		int hoursperweek=40;
		int hoursperyear=50;
		double rateperhour=42.50;
		career="Web Developer";
		
		double Salary=hoursperweek*hoursperyear*rateperhour;
		
		System.out.println("My salary per year is $"+Salary);
		
				
	}

}
