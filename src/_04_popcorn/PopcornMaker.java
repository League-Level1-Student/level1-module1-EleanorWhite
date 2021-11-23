package _04_popcorn;

import java.util.Scanner;

public class PopcornMaker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Flavor: ");
		String flavor = scan.nextLine();
		
		Popcorn pc = new Popcorn("caramel");
	}
}
