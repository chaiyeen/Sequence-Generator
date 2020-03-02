import java.util.ArrayList;
import java.util.Iterator;
////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
//Title:           P7 Sequence Generator
//Files:           ArithmeticSequenceGenerator, DigitProductSequenceGenerator, FibonacciSequenceGenerator, 
//                 GeometricSequenceGenerator, SequenceGeneratorTests
//Course:          CS300, Fall 2018
//
//Author:          Chaiyeen Oh
//Email:           coh26@wisc.edu
//Lecturer's Name: Mouna Ayari Ben Hadj Kacem
//
////////////////////PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
//Partner Name:    (name of your pair programming partner)
//Partner Email:   (email address of your programming partner)
//Partner Lecturer's Name: (name of your partner's lecturer)
//
//VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//___ Write-up states that pair programming is allowed for this assignment.
//___ We have both read and understand the course Pair Programming Policy.
//___ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
//Students who get help from sources other than their partner must fully 
//acknowledge and credit those sources of help here.  Instructors and TAs do 
//not need to be credited here, but tutors, friends, relatives, room mates, 
//strangers, and others do.  If you received no outside help from either type
//of source, then please explicitly indicate NONE.
//
//Persons:         (identify each person and describe their help in detail)
//Online Sources:  Piazza (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * determines the next number by taking every nonzero digit of the previous number, 
 * multiply them and add the product to the previous number itself
 * @author chaiy
 */
public class DigitProductSequenceGenerator {
	private final int INIT; // initial number
	private final int SIZE; // size of sequence
	private ArrayList<Integer> sequence; // ArrayList object storing the sequence

	/**
	 * constructor of Digit Product Sequence Generator
	 * And it generates the digit product sequence and stores its content into sequence
	 */
	public DigitProductSequenceGenerator(int init, int size) {
		if ( size <= 0)
			throw new IllegalArgumentException("WARNING:CANNOT create a sequence with size <= zero.");
		if ( init <= 0)
			throw new IllegalArgumentException("WARNING: The starting element for digit product sequence "
					+ "cannot be less than or equal to zero.");
		this.INIT = init; 
		this.SIZE = size;

		sequence = new ArrayList<Integer>(SIZE); // initializes sequence to an empty ArrayList of elements of type Integer
		generateSequence();	//Generates the digit product sequence and stores its content into sequence.   
	}

	/**
	 * This method generates the digit sequence with first element init and size using loop(s). 
	 * Note that generateSequence() method has to clear the sequence Arraylist content, 
	 * before adding the content of the new sequence to generate
	 */
	public void generateSequence() {
		sequence.clear();
		int current = this.INIT;

		for(int i = 0; i< this.SIZE; i++) {
			int multiple = 1;
			int number = current;
			sequence.add(current);

			while(number > 0) {
				int lastDigit = number % 10;

				if(lastDigit != 0) {
					multiple *= lastDigit;
				}
				number = number/10;
			}
			current = current + multiple; 
		}
	}

	/**
	 * getter
	 * @return sequence iterator
	 */
	public Iterator <Integer> getIterator(){
		// TODO return an Iterator to iterate over the ArrayList sequence field
		return sequence.iterator() ;
	}

}
