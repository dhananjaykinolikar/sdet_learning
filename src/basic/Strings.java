package basic;

public class Strings {

	public static void main(String[] args) {

		String Book="The Lord of Ring";
		String Book2="The Lord of Ring";
		String word="Lord";
		
		if(Book.contains(word));
		System.out.println(" book name contains Lord ");
		
		if(Book.equalsIgnoreCase(Book2))
			System.out.println("Book and Book2 is same");
		
		System.out.println("The Substring of word is: "+word.substring(0,2));
	}

}
