// managing errors
// compilte time / runtime error / Syntacx

public class ErrorMan {

	// all statement must have a semicollon SYSNTAX ERROR
	// add null if you dont need values in variable "String s=null;
	public static void main(String[] args) {
		String s = null;
		System.out.println(s);
		
		// curly bracket is an array form {0,1,2,4} to give a value
		String[] strings = {"Welcome"};
		System.out.println(strings[0]);
		
	}

}