
/* Breakfast Main Version 1.0
 * Samarveer Sandhu
 * October 31, 2018
 * This class allows you to interact with the jars in the cupboard.
 */
import java.util.Scanner;

public class BreakfastMain {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Creating object(cupboard) to store more created objects(jars)
		Cupboard cb = new Cupboard();
		Jar j1 = new Jar("1) Nutella", 150, 150, 300.0);
		Jar j2 = new Jar("2) Raspberry Jam", 400, 400, 800.0);
		Jar j3 = new Jar("3) Peanut Butter", 300, 300, 600.0);	

		// Storing jars in cupboard
		cb.add(j1);
		cb.add(j2);
		cb.add(j3);

		// Main Loop
		boolean var = true;
		while (var) {

			// Greeting
			System.out.println(
					"Good morning, are you hungry?\nYou have some toast I see.\nHere in the cupboard we have three jars of spread:\n");
			System.out.println(cb.toString());

			boolean run = true;
			while (run) {
				System.out.println(
						"What would you like to do?\n(1)Make a toast\n(2)Fill a Jar\n(3)Replace a Jar\n(4)Add a Jar\n(5)Remove Jar\n(6)Exit");
				int decision = in.nextInt();

				// Making a toast
				if (decision == 1) {

					System.out.println("Which spread would you like?");
					int choice = in.nextInt();

					if (choice == 1) {
						System.out.println("How much spread do you wish to have?");
						int quantity = in.nextInt();
						j1.spread(quantity, quantity);
					} else if (choice == 2) {
						System.out.println("How much spread do you wish to have?");
						int quantity = in.nextInt();
						j2.spread(quantity, quantity);
					} else if (choice == 3) {
						System.out.println("How much spread do you wish to have?");
						int quantity = in.nextInt();
						j3.spread(quantity, quantity);
					}
					// Invalid Entry
					else {
						System.out.println("Good-bye, I hope you’re full!");
						var = false;
						break;
					}

				}
				// Filling a jar in Cupboard
				else if (decision == 2) {
					System.out.println("Which jar would you like to fill?");
					int fill = in.nextInt();

					if (fill == 1) {
						System.out.println("By how much?");
						int volQuant = in.nextInt();
						j1.fillJar(volQuant);
					} else if (fill == 2) {
						System.out.println("By how much?");
						int volQuant = in.nextInt();
						j2.fillJar(volQuant);
					} else if (fill == 3) {
						System.out.println("By how much?");
						int volQuant = in.nextInt();
						j3.fillJar(volQuant);
					}
					// Invalid Entry
					else {
						System.out.println("Good-bye, I hope you’re full!");
						var = false;
						break;
					}

				}
				// Replacing a Jar in Cupboard
				else if (decision == 3) {
					System.out.println("Which jar would you like to replace?");
					int replace = in.nextInt();

					if (replace == 1) {

						System.out.println("Name of new jar?");
						String name = in.next();
						System.out.println("Total volume of new jar?");
						int volume = in.nextInt();
						j1 = new Jar("1) " + name, volume, volume, 2 * volume);
						cb.replace(j1, 1);
					} else if (replace == 2) {

						System.out.println("Name of new jar?");
						String name = in.next();
						System.out.println("Total volume of new jar?");
						int volume = in.nextInt();
						j2 = new Jar("2) " + name, volume, volume, 2 * volume);
						cb.replace(j2, 2);
					} else if (replace == 3) {

						System.out.println("Name of new jar?");
						String name = in.next();
						System.out.println("Total volume of new jar?");
						int volume = in.nextInt();
						j3 = new Jar("3) " + name, volume, volume, 2 * volume);
						cb.replace(j3, 3);
					}
					// Invalid Entry
					else {
						System.out.println("Good-bye, I hope you’re full!");
						var = false;
						break;
					}

				}
				// Adding Jar to Cupboard
				else if (decision == 4) {
					// Checking if Cupboard is full
					if (Cupboard.cb.length == 3) {
						System.out.println("Cupboard if full!");
					} else {
						System.out.println("Name of new jar?");
						String name = in.next();
						System.out.println("Total volume of new jar?");
						int volume = in.nextInt();
						cb.add(new Jar(name, volume, volume, 2 * volume));
						System.out.println("Cupboard if full!");
					}
				}
				// Removing a Jar from Cupboard
				else if (decision == 5) {
					System.out.println("Which jar would you like to remove?");
					int choice = in.nextInt();
					cb.remove(choice);

				}
				// Exiting or Invalid Entry
				else {
					// Loop is false
					System.out.println("Good-bye, I hope you’re full!");
					var = false;
					break;
				}
				// Printing the Cupboard
				System.out.println(cb.toString());
			}
		}

		// Closing Scanner
		in.close();
	}
}
