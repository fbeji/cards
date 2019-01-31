package edu.cnm.deepdive;

/**
 * This enum implements suits of standard playing cards. Each enumerated value
 * uses the standard symbol for that suit (taken from Unicode), as its string representation.
 *
 * @author  Faycel Beji &amp; DeepCJAB cohort6
 * @version 1.0
 */

public enum Suit {
  CLUB ("\u2663"),
  DIAMONDS("\u2662"),
  HEART ("\u2661"),
  SPADE ("\u2660");

 private final String symbol;

  Suit(String symbol) {

   this.symbol = symbol;

 }


  @Override
  public String toString() {
    return symbol;
  }
}
