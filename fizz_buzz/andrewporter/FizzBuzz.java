// FizzBuzz
// Counts from 0 to range and prints Fizz if divisible by 3, Buzz if divisible
// by 5, FizzBuzz if divisible by both 3 and 5, otherwise just the number.
// Andrew Porter
// Usage: java FizzBuzz

public class FizzBuzz {

	private int range=100;

	// Constructor
	public FizzBuzz() {
		for (int i=0; i < this.range; i++) {
			System.out.println(this.evaluate(i));
		}
	}

	private String evaluate(int x) {
		String result = "";
		if (x % 3 == 0) result += "Fizz";
		if (x % 5 == 0) result += "Buzz";
		if (result == "") result = Integer.toString(x);
		return result;
	}

	public static void main (String[] args) {
		FizzBuzz fb = new FizzBuzz();
	}

}
