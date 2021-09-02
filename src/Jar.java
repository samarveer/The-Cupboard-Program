
/* Jar Version 1.0
 * Samarveer Sandhu
 * October 31, 2018
 * This class allows the access of all the variables
 */
public class Jar {

	// Initializing instance variables
	private String name;
	private int totalVolume;
	private int remainingVol;
	private double calorieTot;
	private double calorieRem;

	// Constructor that creates the jar
	public Jar(String name, int tV, int rV, double cals) {
		this.name = name;
		this.totalVolume = tV;
		this.remainingVol = rV;
		this.calorieTot = cals;
		this.calorieRem = cals;
	}

	// Getting name of jar
	public String getName() {
		return name;
	}

	// Getting total volume of jar
	public int getTotVol() {
		return totalVolume;
	}

	// Getting remaining volume of jar
	public int getRemVol() {
		return remainingVol;
	}

	// Getting total calories in one jar
	public double getCalTot() {
		return calorieTot;
	}

	// Putting spread on some toast
	public void spread(int volume, int amount) {
		// Checking if the amount to put on toast is available
		if (remainingVol > volume) {
			this.remainingVol -= volume;
			this.calorieRem -= 2 * amount;

		} else {
			System.out.println("Not enough spread.\nPlease try again.\n");
		}

	}

	// Getting calories
	public double getRemCal() {
		return calorieRem;
	}

	// Re-filling a jar
	public void fillJar(int volQuant) {
		// Making sure you cannot fill more than the volume
		if ((totalVolume - remainingVol) >= volQuant) {
			this.remainingVol += volQuant;
		} else if ((totalVolume - remainingVol) == 0) {
			System.out.println("Not enough volume.\n");
		} else {
			System.out.println("Jar is full. Please try again.\n");
		}
	}

	// Printing jars to user
	public String toString() {
		return "\n" + name + " | Volume Remaining: " + remainingVol + " | Total Volume: " + totalVolume
				+ "\nCalories Ate: " + (calorieTot - calorieRem) + "\nTotal Calories in one full jar: " + calorieTot;
	}

}
