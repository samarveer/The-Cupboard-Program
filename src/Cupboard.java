
/* Cupboard Version 1.0
 * Samarveer Sandhu
 * October 31, 2018
 * This class stores all the jars and allows more to be added, removed, replaced. Also prints jars to user. 
 */
public class Cupboard {

	// Creating array to store jars
	static Jar[] cb = new Jar[3];

	// Adding jars into the array
	public void add(Jar j) {
		for (int i = 0; i < cb.length; i++) {
			// Checking if there is actually a jar in place
			if (cb[i] == null) {
				cb[i] = j;
				break;
			}
		}
	}

	// Replacing Jar
	public void replace(Jar j, int jar) {
		this.cb[jar - 1] = j;
	}

	// Removing Jar
	public void remove(int jar) {
		// Checking if jar is already empty or not
		if (cb[jar - 1] != null) {
		} else {
			System.out.println("It is already empty.");
		}

	}

	// Printing to user
	public String toString() {
		String output = "";
		for (int i = 0; i < cb.length; i++) {
			// Checking if there is actually a jar
			if (cb[i] != null) {
				output += cb[i].toString();
			}
			output += "\n";
		}

		return output;
	}

}
