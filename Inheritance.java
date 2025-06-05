package javaprograms;

class Parent{
	void greet() {
		System.out.println("Hello Child");
	}
}

public class Inheritance extends Parent {
	public static void main(String[] args) {
		Inheritance ih = new Inheritance();
		ih.greet();
		
	}
}