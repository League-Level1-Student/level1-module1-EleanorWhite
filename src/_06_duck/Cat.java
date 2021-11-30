package _06_duck;


public class Cat {
	int age;
	String name;
	
	Cat(String name, int age) {
      	this.name = name;
      	this.age = age;
}
	
	void meow() {
		System.out.println("MEOW");
	}
	
	void purr() {
		System.out.println("purr");
	}
	
}