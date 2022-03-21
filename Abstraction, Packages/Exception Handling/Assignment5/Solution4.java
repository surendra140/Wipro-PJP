
class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		System.out.println("Invalid age");
	}
}

public class Solution4 {
	public static void main(String[] args) throws InvalidAgeException {
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();
		System.out.println("Name: " + name + " Age: " + age);
	}
}

