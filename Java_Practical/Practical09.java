// Java Program to Handle Divide By Zero Exception
//import java.io.*;
// public class Practical09 {
// 	public static void main(String[] args) {
// 		int a = 5;
// 		int b = 0;
// 		try {
// 			System.out.println(a / b); // throw Exception
// 		} catch (ArithmeticException e) {
// 			// Exception handler
// 			System.out.println(
// 					"Divided by zero operation cannot possible");
// 		}
// 	}
// }

class thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread-1 is Running");
		}
	}
}

class B extends Thread {
	public void run() {
		System.out.println("Thread-2 is Running");
	}
}

class C extends Thread {
	public void run() {
		System.out.println("Thread-3 is Runnning");
	}
}

public class Practical09 {
	public static void main(String[] args) {
		thread1 t1 = new thread1();
		B b = new B();
		C c = new C();
		t1.start();
		b.start();
		c.start();
	}
}
