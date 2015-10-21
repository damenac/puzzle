package fr.inria.diverse.k3.sle.common.utils;

import java.util.Random;

public class RandomNumber {


	// --------------------------------------------
	// Attributes
	// --------------------------------------------	
	
	/**
	 * Unique instance of this class
	 */
	public static RandomNumber number;

	/**
	 * Randomnumber of the class 
	 */
	private Random randomNumber;
	
	// --------------------------------------------
	// Constructor
	// --------------------------------------------
	
	/**
	 * Default constructor of the class
	 * @param seed - Seed for the number number
	 */
	private RandomNumber(int seed){
		randomNumber = new Random(seed);
	}

	// ---------------------------------------
	// Methods
	// ---------------------------------------	
	
	/**
	 * Returns a random number in the interval between the min and the max
	 * parameters
	 * @param min - Lower value of the interval
	 * @param max - Max value of the interval
	 * @return a number between the min and the max
	 */
	public int randomNumber(int min, int max) {
		int a = randomNumber.nextInt(max);
		return a;
	}
	
	/**
	 * Returns a random double number between 0 and 1
	 * @return double between 0 and 1
	 */
	public double randomDouble(){
		return randomNumber.nextDouble();
	}
	
	/**
	 * Returns the unique instance of the class
	 * @return number - unique instance of this class
	 */
	public static RandomNumber getInstance(){
		if(number==null){
			number = new RandomNumber(0);
		}
		return number;
	}
}
