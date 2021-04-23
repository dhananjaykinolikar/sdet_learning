package oop;

public class BankAccount implements iRate {
	
	//Static belong to class and to Object instance
	//final>> is constant >> often static final
	static final String routingnumber="65432";
	
	//instance variable
	String AccountType;
	private String Accountnumber;
	private String name;
	String ssn;
	double balance;
	
	//Construction definition Unique method.
	//1. They are use to define/set/initiate properties of an object
	//2. Constructor are implicitly called
	//3. Same name as class itself
	//4. Construction has no return type.
	
	//overloading: cal the same method with different argument
	 BankAccount() {
		System.out.println("New Account created");
	}
	
	 BankAccount(String AccountType) {
		System.out.println("The Account Type is: "+AccountType);
	}
	
	 BankAccount(String Accounttype, double intDeposit) {
		System.out.println("The Account Type is: "+AccountType+"Amount Deposited is: $"+intDeposit);
		
		//msg are local variable
		String msg=null;
		if(intDeposit<1000) {
			msg="The Min deposit amount should be grater than 1000";
		}
		else {
			msg="Thanks for Deposit: $"+intDeposit;
			
		}
		System.out.println(msg);
		balance =balance+intDeposit;
	}

//Define Method
	 private void showactivity(String activity) {
		 System.out.println("The Transaction is "+activity);
	 }
	 
void Deposit(double AmtDeposit) {
	balance = balance+AmtDeposit;
	showactivity("DEPOSIT");
	
}

void Withdraw(double Amtwithdraw) {
	balance = balance-Amtwithdraw;
	showactivity("WITHDRAW");
	
}


void Accountstatus() {
	System.out.println("The Current balance amount is: $"+balance);;
}

@Override
public String toString() {
	return  "\n name of Customer: "+name+"\n Account Number: "+Accountnumber;
}

//Encapsulation
//getter and setter
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = "Mr."+ name;
}

public String getSsn() {
	return ssn;
}

public void setSsn(String ssn) {
	this.ssn = ssn;
}

@Override
public void setRate() {
	System.out.println("The set Rate");
	
}

@Override
public void IncreaseRate() {
	System.out.println("The Increase Rate");
	
}


}