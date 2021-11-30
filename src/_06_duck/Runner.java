package _06_duck;


public class Runner {
	public static void main(String[] args) {
		Duck d = new Duck("popcorn", 0);
		Cat c = new Cat("Macavity", 103);
		d.quack();
		d.waddle();
		
		c.meow();
		c.purr();
	}
}