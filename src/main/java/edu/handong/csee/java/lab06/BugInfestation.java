package edu.handong.csee.java.lab06;
import java.util.Scanner;

	

public class BugInfestation {
	
	final double GROWTH_RATE = 0.95;
	final double ONE_BUG_VOLUME = 0.002;
	
	public void roachCount() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number of Roaches :  ");
		double startPopulation = keyboard.nextDouble();
		System.out.print("Enter the size of house in volume");
		double houseVolume = keyboard.nextDouble();
		
		double population = startPopulation;
		
		double totalBugVolume = population * ONE_BUG_VOLUME;
		
		int countWeeks = 0;
		
		while(totalBugVolume < houseVolume)
		{
			double newBugs = population * GROWTH_RATE;
			double newBugVolume = newBugs * ONE_BUG_VOLUME;
			population = population + newBugs;
			totalBugVolume = totalBugVolume + newBugVolume;
			countWeeks++;
		}
		System.out.println("Initial Bug Population = " + startPopulation);
		System.out.println("House Volume =  " + houseVolume);
		System.out.println("Duration passed =  " + countWeeks);
		System.out.println("Final population =  " + population);
		System.out.println("Total Bug Volume =  " + totalBugVolume);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugInfestation bug = new BugInfestation();
		
		bug.roachCount();
	}

}
