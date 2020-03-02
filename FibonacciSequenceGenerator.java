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
import java.util.Iterator;
   /**
    * determines the next number by summing the two most recent previous values. 
    * To start the sequence, the first two values are conventionally 0 and 1, *
    */
   public class FibonacciSequenceGenerator implements Iterator<Integer> {
     private final int SIZE; // number of elements in this sequence
     private int prev; // previous item in the sequence with respect to the current iteration
     private int next; // next item in the sequence with respect to the current iteration
     private int generatedCount; // number of items generated so far
 
  /**
   * constructor for FibonacciSequenceGenerator class
   * @param size
   */
  public FibonacciSequenceGenerator(int size) {
	  if (size <= 0)
		  throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size<=zero.");

	   this.SIZE = size; 
	   this.prev = 0; // prev field initialized to 0 that represents the first item in the standard Fibonacci sequence
	   this.next = 1; // next field initialized to 1 which represents the second item in the same sequence
	   this.generatedCount = 0; 
  }
 
  /**
   * method for checking whether there is element after the current element
   * it overrides hasNext()
   * @return false if the GeneratedCount is bigger than the size
   */
  @Override
  public boolean hasNext() {
	  return generatedCount < SIZE;
  }
 
  /**
   * method that decides that element to put next to current value
   * overrides previous next() method
   * first it initialize current value on where "next" is
   * then advance next value (sum of two previous numbers)
   * and advance the previous value
   * @return null if there isn't an element next or else return x 
   */
  @Override
  public Integer next() {
	 if (!hasNext()) {
		 return null;
	 }
	 else {
		 int x = prev;
		 int current = next; // initialize current value on where "next" is
		 generatedCount++;
		 next = prev + current; // advance next value (sum of two previous numbers)
		 prev = current; // advance previous value
		 return x;
	 }
  }
}