package Java;

public class ExpressaoRegular {

	public static void main(String[] args) {
		 
		
		//boolean b = "Java".matches("Java");
		
		//b = "Java".matches("(?i)java");
		
		//boolean b = "61611-020".matches("\\d{5}-\\d{3}");
		//boolean b = "10/08/1995".matches("\\d{2}/\\d{2}/\\d{4}");
		boolean b = "miquelanepmelo@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}");
		
			System.out.println(b);

	}

}
