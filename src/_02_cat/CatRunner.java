package _02_cat;

public class CatRunner {
	
	public static void main(String[] args) {
		Cat meow = new Cat("meow");
		meow.printName();
		for (int i = 0;  i < 9; i++) {
			meow.kill();
		}
	}

}
