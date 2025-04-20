//                                Java Practical 02
//                                Method Overloading

// Java Program to Implement

class Practical02A {

	static void add(int a, int b) {
		System.out.println("Addition of 2 Parameter is : " + (a + b));
	}

	static void add(int a, int b, int c) {
		System.out.println("Addition of 3 Parameter is : " + (a + b + c));
	}

	// Main Function
	public static void main(String args[]) {
		System.out.println("add() with 2 parameters");
		// Calling function with 2 parameters
		add(4, 6);

		System.out.println("add() with 3 parameters");
		// Calling function with 3 Parameters
		add(4, 6, 7);
	}
}
