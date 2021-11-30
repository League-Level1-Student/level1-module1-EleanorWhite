package _04_popcorn;

import java.util.Scanner;

public class PopcornMaker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Flavor: ");
		String flavor = scan.nextLine();
		
		System.out.print("Number of minutes to cook popcorn: ");
		int numMinutes = scan.nextInt();
		
		Popcorn pc = new Popcorn(flavor);
		Microwave m = new Microwave();
		
		m.putInMicrowave(pc);
		m.setTime(numMinutes);
		m.startMicrowave();
	}
}
