package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount bankaccount = new BankAccount();
		
		bankaccount.setName("Joan");
		System.out.println("Name is: "+bankaccount.getName());
		
		bankaccount.setSsn("987456");
		System.out.println("The SSN number is: "+bankaccount.getSsn());
		
		bankaccount.setRate();
		bankaccount.IncreaseRate();
		
		
		//bankaccount.name="Troy";
		//bankaccount.Accountnumber="98765432";
		
		System.out.println("The Customer details"+bankaccount.toString()+"\n");
		
		BankAccount bankaccount1 = new BankAccount("Saving Account");
		
		BankAccount bankaccount2 = new BankAccount("Saving Account", 5000);
		
		System.out.println("The routing number is: "+bankaccount.routingnumber);
		System.out.println("The routing number is: "+bankaccount1.routingnumber);
		System.out.println("The routing number is: "+bankaccount2.routingnumber);
		
		bankaccount2.Deposit(5000);
		bankaccount2.Accountstatus();
		
		//inheritence
		CDAccount acc1 =new CDAccount();
		//acc1.name="jone";
		//acc1.Accountnumber="123456789";
		
		System.out.println("CDAccount Customer details"+acc1.toString()+"\n");

	}

}
