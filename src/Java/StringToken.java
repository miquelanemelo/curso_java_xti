package Java;

public class StringToken {

	public static void main(String[] args) {
		String s = "XHTML; CSS; JAVA; JAVASCRIPT";
		String[] tokens = s.split(";");
		System.out.println(tokens.length + " tokens");

		for (String token : tokens) 
			System.out.println(token);
		
	}

}
