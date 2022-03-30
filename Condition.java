public class Condition{
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1 != s2) {
			System.out.println("They matched.");
		}
		else {
			System.out.println("Not matched.");
		}
		if(s1.equals(s2)) {
			System.out.println("They matched.");
		}
		else {
			System.out.println("Not matched.");
		}
	}
}