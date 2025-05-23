package Java_Practical;

//                               Method Overriding
// Java Program to implement

// Base Class
class Animal {
	protected void eat() {
		System.out.println("eat() method of base class");
		System.out.println("eating.");
	}
}

// Inherited Class
class Dog extends Animal {
	protected void eat() {
		System.out.println("eat() method of derived class");
		System.out.println("Dog is eating.");
	}
}

class Practical02 {
	// Main Function
	public static void main(String args[]) {
		Dog d1 = new Dog();
		Animal a1 = new Animal();

		d1.eat();
		a1.eat();

		Animal animal = new Dog();
		animal.eat();
	}
}
