import java.util.ArrayList;
import java.util.Iterator;

//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           P7 Sequence Generator
// Files:           ArithmeticSequenceGenerator, DigitProductSequenceGenerator, FibonacciSequenceGenerator, 
//                  GeometricSequenceGenerator, SequenceGeneratorTests
// Course:          CS300, Fall 2018
//
// Author:          Chaiyeen Oh
// Email:           coh26@wisc.edu
// Lecturer's Name: Mouna Ayari Ben Hadj Kacem
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    (name of your pair programming partner)
// Partner Email:   (email address of your programming partner)
// Partner Lecturer's Name: (name of your partner's lecturer)
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   ___ Write-up states that pair programming is allowed for this assignment.
//   ___ We have both read and understand the course Pair Programming Policy.
//   ___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates, 
// strangers, and others do.  If you received no outside help from either type
//  of source, then please explicitly indicate NONE.
//
// Persons:         (identify each person and describe their help in detail)
// Online Sources:  Piazza (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
public class SequenceGeneratorTests {
	public static void main(String[] args) {
		geometricSequenceGeneratorTest();
		fibonacciSequenceGeneratorTest();
		DigitProductSequenceGeneratorTest();
	}

	/**
	 * Test method for geometricSequenceGenerator method
	 * Sample example of initial value of 1, ratio value of 2, and size of 3
	 * @return false if either constructor is not appropriately working as intended
	 */
	public static boolean geometricSequenceGeneratorTest() {
		int inital = 1;
		int ratio = 2;
		int size = 3;
		GeometricSequenceGenerator n = new GeometricSequenceGenerator(inital, ratio, size);
		int nextInteger = n.getNext(); 
		
		if(nextInteger != 1) {
			System.out.println("Geometric Sequence Generator Test FAILED");
			return false;
		}
		else {
			System.out.println("Geometric Sequence Generator Test PASSED!");
			return true;
		}
	}

	/** Test method testing if fibonacciSequenceGenerator class is working appropriately
	 * @return true if the fibonacci sequence generator is successfully working
	 */
	public static boolean fibonacciSequenceGeneratorTest() {
		int sampleSize = 10;
		String result = "";
		FibonacciSequenceGenerator f = new FibonacciSequenceGenerator(sampleSize);
		
		while(f.hasNext()) {
			result = result + f.next() + " ";
		}
	
		if(!result.equals("0 1 1 2 3 5 8 13 21 34 ")) {
			System.out.println("fibonacci Sequence Generator Test FAILED");
			return false;
		}
		else {
			System.out.println("fibonacci Sequence Generator Test PASSED!");
			return true;
		}
	}

	/** Test method testing if DigitProductSequenceGenerator class is working appropriately
	 * @return true if the digit product sequence generator is successfully working
	 */
	public static boolean DigitProductSequenceGeneratorTest() {
		int firstNumber = 13;
		int sampleSize = 5;
		String result = "";
		
		Iterator<Integer> d = new DigitProductSequenceGenerator(firstNumber,sampleSize).getIterator();
		
		while(d.hasNext()) {
		   result = result + d.next() + " ";
		}

		if(!result.equals("13 16 22 26 38 ")) {
			System.out.println("DigitProduct Sequence Generator Test FAILED");
			return false;
		}
		else {
			System.out.println("DigitProduct Sequence Generator Test PASSED!");
			return true;
		}
	}
}
