package edu.handong.csee.java.lab06;
import java.util.Scanner;

/** This class calculates the Infestation of roaches in a given volume.
 * if volume of roaches is smaller than the given volume ie house volume
 * then the number of roaches increases by growth rate and the program continues to compare
 * new volume of total roaches with the house volume.
 * Also weeks are counted to show the duration of infestation.
 * @author to291
 *
 */

public class BugInfestation {
	
	final double GROWTH_RATE = 0.95; //Declare Growth Rate and One Bug Volume as a constant 
	final double ONE_BUG_VOLUME = 0.002;//These values will be used to calculate the population and volume of roaches
	
	/** This method takes in initial number of roaches and house volume from the user then
	 * calculates the volume of roaches and compares with the volume of the house. If the volume
	 * of roaches < then the volume of the house, population of roaches accumulates and new volume of roaches
	 * are given. This process continues untill volume of roaches > the volume of house and in the end
	 * it prints out the weeks it took, final population of roaches, final Total Volume of roaches
	 *  
	 */
	public void roachCount() {
		
		Scanner keyboard = new Scanner(System.in); //instatiate scanner to keyboard as user can now input data
		
		System.out.print("Enter the number of Roaches :  "); //print to tell user to input initial no. of roaches 
		double startPopulation = keyboard.nextDouble(); // takes input
		System.out.print("Enter the size of house in volume(cubic meters) : "); //tell user to input the volume of house
		
		double houseVolume = keyboard.nextDouble(); //takes input
		
		double population = startPopulation; //put initial population into population
		
		double totalBugVolume = population * ONE_BUG_VOLUME; //calculate the initial volume of bugs
		
		int countWeeks = 0; //declare countweek to count weeks
		
		while(totalBugVolume < houseVolume) // introduce while loop to compare and calculate the volume
		{ //if bugvolume is smaller than housevolume
			double newBugs = population * GROWTH_RATE; //new bugs generated
			double newBugVolume = newBugs * ONE_BUG_VOLUME; //new bugvolume
			population = population + newBugs; // new bugs + original population = new population
			totalBugVolume = totalBugVolume + newBugVolume; //new bug volume + original bug volume = new total bug volume
			countWeeks++; // countweek = 1 + countweek
		}
		//print out when while loop conditions are not met ie totalBugVolume > houseVolume
		System.out.println("Initial Bug Population = " + startPopulation);   //print initial population
		System.out.println("House Volume =  " + houseVolume + " cubic meters"); // print out initial house volume
		System.out.println("Duration passed =  " + countWeeks+" weeks"); //print out no. of weeks passed
		System.out.printf("Final population = %d roaches\n ", (int)population); //print out final population
		System.out.println("Total Bug Volume =  " + (int)totalBugVolume + " cubic meters"); //print out total volume
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugInfestation bug = new BugInfestation(); //in main instantiate the class
		
		bug.roachCount(); //and call method roachCount(); initiate the program
	}

}
