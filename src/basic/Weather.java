package basic;

public class Weather {
	
	public static void main(String[] arg) {
		
		int Temperature=-10;
		String sunCondition="OverCast";
		
		if(Temperature>80) {
			System.out.println("Today wheather is pleasant wear short and tshirt");
		
		}
		else if(Temperature>60 && (sunCondition=="Sunny")) {
			System.out.println("Today wheather is cool wear long sleeve shirt and jeans");
			System.out.println("Wear hat to keep sun out of your eyes");
		}
		else if(Temperature>50 || (sunCondition=="unOverCast") ) {
			System.out.println("Today wheather is cool make sure you wear sweater");
			
		}
		else {
			System.out.println("Wear sweater");
		}
		
		System.out.println(" Program ending");
	}

}
