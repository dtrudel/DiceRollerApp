import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome To The GC Casino!");
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.print("How Many Sides Do Your Die Have? ");
			int sides = scan.nextInt();

			if (sides <= 0) {
				System.out.println("Enter a VALID number of sides ");
			} else {

				int die1 = rollDie(sides);
				int die2 = rollDie(sides);
				System.out.println("Die 1 landed on " + die1 + "\nDie 2 landed on " + die2);

				if (die1 == 1 && die2 == 1) {
					System.out.println("Snake Eyes!");
				}
				if ((die1 + die2) == 7 || (die1 + die2) == 11) {
					System.out.println("Craps!");
				}
				if (die1 == 6 && die2 == 6) {
					System.out.println("Box Cars!");
				}
				System.out.print("Roll Again? y/n ");
				cont = scan.next();
			}
		}
		System.out.println("Thanks for playing");

		scan.close();
	}

	public static int rollDie(int die) {
		Random rnd = new Random();
		int r = rnd.nextInt(die) + 1;
		return r;
	}

}
