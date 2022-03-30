// To finish the program even if errors occur
// using try catch block

public class ErrorExeptions {

	public static void main(String[] args) {
		
		try {
			String[] strings = {"Welcome"};
			System.out.println(strings[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// the error message
			e.printStackTrace();
			System.out.println("There was an error");
		}
		
		System.out.println("The application is still running");
		
	}

}