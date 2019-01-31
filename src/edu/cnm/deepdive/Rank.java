package edu.cnm.deepdive;

/**
 * This enum ranks of standard playing cards. All enumerated values
 * (instances) use a 1 or 2-character
 *
 *
 *
 */

public enum Rank {

  ACE("A"),
   TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING ("k");

  private final String symbol;

  Rank(String symbol) {

    this.symbol = symbol;

  }


  @Override
  public String toString() {
    return symbol;
  }
}
