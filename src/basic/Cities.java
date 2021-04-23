package basic;

public class Cities {

	public static void main(String[] args) {
		
		String[] States = {"Pune","Mumbai","Banglore","Chennai"};
		
		System.out.println(States[1]);
		
		String[] Countries;
		
		Countries = new String[4];
		
		Countries[0]="India";
		Countries[1]="Singapore";
		Countries[2]="Germany";
		Countries[3]="USA";
		
		System.out.println(Countries[1]);
		
		System.out.println(" below is For loop example");
		for(int i=0;i<Countries.length;i++) {
			
			System.out.println("The Arrey values are: "+Countries[i]);
		}
		//	
		System.out.println(" below is do loop example");
		
		int i=0;
		do {
			
			System.out.println("The Arrey value of states: "+States[i]);
			i=i+1;
		}while(i<4);
		
		//
		System.out.println(" below is while loop example");
		
		int n=0;
		boolean statefound= false;
		while(!statefound) {
			String state = States[n];
			System.out.println("The States are: "+state);
			
			if(state=="Chennai")
			{
				System.out.println(" State found");
			statefound=true;
			}
			n++;
		}
		
		
	}

}
